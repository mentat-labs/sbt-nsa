package com.mentatlabs.nsa
package scalac
package dsl

import options._

import org.specs2._
import scala.annotation.tailrec
import java.io.File
import scalax.file._

class ScalacOptionsDSLSpec extends Specification {
  def is = s2"""
  name sync check      ${nameSyncCheck}
  check missing        ${checkMissing}
"""

  @tailrec
  private def toClassCase(remaining: List[Char], soFar: StringBuilder, nextUp: Boolean): String =
    remaining match {
      case Nil => soFar.toString

      case '-' :: tail =>
        toClassCase(tail, soFar, true)

      case ch :: tail if ch == 'X' || ch == 'Y' =>
        toClassCase(tail, soFar += ch, true)

      case ch :: tail if nextUp =>
        toClassCase(tail, soFar += ch.toUpper, false)

      case ch :: tail =>
        toClassCase(tail, soFar += ch, nextUp)
    }

  private val instance = new ScalacOptionsDSL {}

  lazy val options = (instance.getClass.getMethods flatMap { method =>
    val name = method.getName.replace("$minus", "-")
    if (name startsWith "-") {
      Some((name, method invoke instance))
    } else {
      None
    }
  }).toMap

  def nameSyncCheck =
    (options map { case (name, obj) =>
      val className = obj.getClass.getSimpleName.init
      val calculatedClassName = toClassCase(name.toList, new StringBuilder("Scalac"), false)
      className === calculatedClassName
    }).toList

  def checkMissing = {
    val linked = options.values map { obj =>
      obj.getClass.getSimpleName.init
    } toSet

    val packageName = ScalacX.getClass.getPackage.getName
    val resourceUrl = packageName.replace('.', '/')

    import scala.collection.JavaConversions._
    val paths = Thread.currentThread.getContextClassLoader
      .getResources(resourceUrl)
      .map(_.getFile)
      .filterNot(_ contains "test-classes")
      .flatMap(file => Path(new File(file)) ** "*.class")

    val found = paths.map(_.name.replaceFirst("(\\$.*)?\\.class$", "")).toSet

    val missingOptions = found -- linked
    val extraOptions = linked -- found

    missingOptions.size === 0 and
    extraOptions.size === 0
  }
}
