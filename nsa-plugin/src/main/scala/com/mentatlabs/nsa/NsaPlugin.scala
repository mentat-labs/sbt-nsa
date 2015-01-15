package com.mentatlabs.nsa

import sbt._
import Keys._

object NsaPlugin extends AutoPlugin {
  object autoImport {
    lazy val typedScalacVersion = SettingKey[ScalacVersion]("typed-scalac-version", "Typed version of Scalac used for building.")
    lazy val typedScalacOptions = SettingKey[Seq[TypedOption]]("typed-scalac-options", "Typed options for the Scala compiler.")
  }

  import autoImport._

  override lazy val projectSettings = Seq(
    typedScalacVersion := {
      val sv = scalaVersion.value
      ScalacVersion(sv).getOrElse(sys.error("Could not resolve Scalac version from: " + sv))
    }
  )
}
