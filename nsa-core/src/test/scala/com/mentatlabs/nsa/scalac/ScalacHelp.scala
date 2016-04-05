package com.mentatlabs.nsa
package scalac

class ScalacHelp(
    val help: String
  , val advancedHelp: Option[String]
  , val privateHelp: Option[String]) {

  override val toString =
    help + advancedHelp.getOrElse("") + privateHelp.getOrElse("")
}

object ScalacHelp {
  // TODO: list versions via macro instead of reflection
  val versions = {
    //can't reference scalac package object...
    val tmp = new ScalacVersions {}

    (for {
      m <- classOf[ScalacVersions].getMethods
      if m.getReturnType == classOf[ScalacVersion]
    } yield {
      m.invoke(tmp).asInstanceOf[ScalacVersion]
    }).toList.sorted
  }

  // -------------------------------------------------------------------------------------------------------------------

  import scalax.io._, Codec.UTF8
  import scala.collection.mutable.LinkedHashMap

  def read(resource: String) = util.Try {
    Resource.fromClasspath(resource).string(UTF8).ensuring(_.length >= 500,
      s"Resource doesn't look like a help listing: $resource")
  }.toOption

  val maxLength = versions.view.map(_.toString.length).max
  val helps = LinkedHashMap.empty ++ (versions map { sv =>
    sv -> new ScalacHelp(
      help = read(s"scalac/scalac-$sv.txt").getOrElse(
        sys.error(s"Could not read scala help for $sv"))
    , advancedHelp = read(s"scalac/scalac-$sv-X.txt").ensuring(_.isDefined || sv < ScalacVersions.`2.6.0`,
        sys.error(s"Could not read scala advanced help for $sv"))
    , privateHelp = read(s"scalac/scalac-$sv-Y.txt").ensuring(_.isDefined || sv < ScalacVersions.`2.6.0`,
        sys.error(s"Could not read scala private help for $sv"))
    )
  })
}
