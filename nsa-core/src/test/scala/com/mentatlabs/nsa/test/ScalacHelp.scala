package com.mentatlabs.nsa
package test

import ScalacVersion._

object ScalacVersions {
  val values = Seq(
    `2.0.0`
  , `2.1.0`, `2.1.1`, `2.1.2`, `2.1.3`, `2.1.4`, `2.1.5`, `2.1.6`, `2.1.7`, `2.1.8`
  , `2.2.0`
  , `2.3.0`, `2.3.1`, `2.3.2`, `2.3.3`
  , `2.4.0`
  , `2.5.0`, `2.5.1`
  , `2.6.0`, `2.6.1`
  , `2.7.0`, `2.7.1`, `2.7.2`, `2.7.3`, `2.7.4`, `2.7.5`, `2.7.6`, `2.7.7`
  , `2.8.0`, `2.8.1`, `2.8.2`
  , `2.9.0`, `2.9.0-1`, `2.9.1`, `2.9.1-1`, `2.9.2`, `2.9.3`
  , `2.10.0`, `2.10.1`, `2.10.2`, `2.10.3`, `2.10.4`
  , `2.11.0`, `2.11.1`, `2.11.2`, `2.11.3`, `2.11.4`
  , `2.12.0`
  )
}

class ScalacHelp(
    val help: String
  , val advancedHelp: Option[String]
  , val privateHelp: Option[String]) {

  override val toString =
    help + advancedHelp.getOrElse("") + privateHelp.getOrElse("")
}

object ScalacHelp {
  import scalax.io._, Codec.UTF8
  import scala.util.Try
  import scala.collection.mutable.LinkedHashMap

  def read(resource: String) = Try {
    Resource.fromClasspath(resource).string(UTF8).ensuring(_.length >= 1000,
      s"Resource doesn't look like a help listing: $resource")
  }.toOption

  val helps = LinkedHashMap.empty ++ (ScalacVersions.values map { sv =>
    sv -> new ScalacHelp(
      help = read(s"scalac-$sv.txt").getOrElse(
        sys.error(s"Could not read scala help for $sv"))
    , advancedHelp = read(s"scalac-$sv-X.txt").ensuring(_.isDefined || sv < `2.6.0`,
        sys.error(s"Could not read scala advanced help for $sv"))
    , privateHelp = read(s"scalac-$sv-Y.txt").ensuring(_.isDefined || sv < `2.6.0`,
        sys.error(s"Could not read scala private help for $sv"))
    )
  })
}
