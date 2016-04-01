package com.mentatlabs.nsa

import sbt._
import Keys._

object NsaPlugin extends AutoPlugin {
  import scalac._

  object autoImport
      extends ScalacVersions
      with dsl.ScalacOptionsDSL {

    object nsaExperimentalDsl extends dsl.ScalacOptionsExperimentalDSL

    lazy val nsaScalaVersion = SettingKey[ScalacVersion]("nsa-scala-version", "Strongly typed Scala version")
    lazy val nsaScalacOptions = SettingKey[Seq[ScalacOption]]("nsa-scalac-options", "Strongly typed Scalac options")

    implicit def `ScalacVersion2String`(scalacVersion: scalac.ScalacVersion): String =
      scalacVersion.toString
  }

  import autoImport._

  override lazy val projectSettings = Seq(
    nsaScalaVersion := {
      val sv = scalaVersion.value
      ScalacVersion(sv).getOrElse(sys.error("Could not determine Scalac version from: " + sv))
    }
  , nsaScalacOptions := Nil
  , scalacOptions ++= nsaScalacOptions.value
      .filter(_ isDefinedAt nsaScalaVersion.value)
      .flatMap(_.params)
  )
}
