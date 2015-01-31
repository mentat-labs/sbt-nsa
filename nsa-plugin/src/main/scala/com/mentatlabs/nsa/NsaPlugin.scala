package com.mentatlabs.nsa

import sbt._
import Keys._

object NsaPlugin extends AutoPlugin {
  import scalac._

  object autoImport
      extends ScalacVersions
      with dsl.ScalacOptionsDSL {

    lazy val nsaScalacVersion = SettingKey[ScalacVersion]("nsa-scalac-version", "Strongly typed version of Scalac derived from stringly typed scalaVersion")
    lazy val nsaScalacOptions = SettingKey[Seq[ScalacOption]]("nsa-scalac-options", "Typed options for the Scala compiler.")

    implicit def PimpedScalacVersion(scalacVersion: scalac.ScalacVersion) =
      scalacVersion.toString

    implicit def PimpedScalacVersionSeq(scalacVersions: Seq[scalac.ScalacVersion]) =
      scalacVersions.map(_.toString)
  }

  import autoImport._

  override lazy val projectSettings = Seq(
    nsaScalacVersion := {
      val sv = scalaVersion.value
      ScalacVersion(sv).getOrElse(sys.error("Could not determine Scalac version from: " + sv))
    }

  , nsaScalacOptions := Nil

  , scalacOptions ++= {
      val tsv = nsaScalacVersion.value

      nsaScalacOptions.value flatMap { tso =>
        if (tso.isDefinedAt(tsv)) {
          tso.params
        }
        else {
          Nil
        }
      }
    }
  )
}
