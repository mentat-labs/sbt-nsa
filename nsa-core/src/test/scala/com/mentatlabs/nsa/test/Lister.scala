package com.mentatlabs.nsa
package test

import scalax.file._
import scala.collection.immutable.TreeMap

object Lister extends App {
  val OptionPattern = "^  ([@-]\\S+(?: <[^>]+>)?) +(.*)$".r

  val optionLines =
    ScalacHelp.helps.toSeq flatMap { case (version, help) =>
      val lines = (help.toString split "\n")

      lines collect {
        case OptionPattern(option, description) =>
          option -> ((version, description))
      }
    }

  val options =
    (optionLines.groupBy(_._1) mapValues { versions =>
      TreeMap.empty[ScalacVersion, String] ++ versions.map(_._2)
    }).toSeq.sortBy(_._1)

  options foreach { case (option, versions) =>
    val sb = new StringBuilder
    sb ++= option += '\n' ++= "=" * option.length += '\n'

    val first = versions.head._1

    def processVersions(
        toBeProcessed: Seq[ScalacVersion],
        currentDescription: Option[String],
        currentFirstVersion: Option[ScalacVersion],
        currentLastVersion: Option[ScalacVersion]): Unit = {

      /** Output current state */
      def output(): Unit = {
        val first = currentFirstVersion.get
        val last = currentLastVersion.get
        val description = currentDescription getOrElse "!! missing !!"
        val version = if (first == last) first.toString else first + " - " + last
        sb ++= "%%%ds: %%s%n".format(ScalacHelpVersions.maxLength * 2 + 3).format(version, description)
      }

      if (toBeProcessed.isEmpty) {
        // Exit condition
        output()
      }
      else {
        val head :: tail = toBeProcessed
        val exists = versions get head
        val current = Some(head)

        exists match {
          // First encounter of an existing option description
          case e @ Some(description) if currentFirstVersion == None =>
            processVersions(tail, e, current, current)

          // Repeated existing description - aggregating versions
          case e @ Some(description) if e == currentDescription =>
            processVersions(tail, currentDescription, currentFirstVersion, Some(head))

          // Previous description has changed, output last description, start tracking new description
          case e @ Some(description) =>
            output()
            processVersions(tail, e, current, current)

          // There was no option present, but let's assume that it's not yet missing
          case None if head < first =>
            processVersions(tail, currentDescription, currentFirstVersion, currentLastVersion)

          // There was no option present, but since a description was here previously it must be missing now
          case None if currentDescription != None =>
            output()
            processVersions(tail, None, current, current)

          // The option is still missing, so aggregate missing versions
          case None =>
            processVersions(tail, currentDescription, currentFirstVersion, current)
        }
      }
    }

    processVersions(ScalacHelpVersions.values, None, None, None)

    println(sb)
  }
}
