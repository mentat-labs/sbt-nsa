import sbt._
import Keys._

object Build extends Build {
  private def defaultSettings = Seq(
      organization := "com.mentatlabs.nsa"
    , scalaVersion := "2.10.4"

    , scalacOptions := Seq(
        "-deprecation"
      , "-encoding", "UTF-8"
      , "-feature"
      , "-language:existentials"
      , "-language:implicitConversions"
      , "-language:postfixOps"
      , "-language:reflectiveCalls"
      , "-optimise"
      , "-unchecked"
      , "-Xcheckinit"
      , "-Xlint"
      , "-Xmax-classfile-name", "72"
      , "-Xno-forwarders"
      , "-Xverify"
      , "-Yclosure-elim"
      , "-Ydead-code"
      , "-Yinline-warnings"
      , "-Yinline"
      , "-Yrepl-sync"
      , "-Ywarn-adapted-args"
      , "-Ywarn-dead-code"
      , "-Ywarn-inaccessible"
      , "-Ywarn-nullary-override"
      , "-Ywarn-nullary-unit"
      , "-Ywarn-numeric-widen"
      )

    , scalacOptions in Test ++= Seq("-Yrangepos")
    )

  // -----------------------------------------------------------------------------------------------------

  val specs2 = "org.specs2" %% "specs2-core" % "2.4.15"
  val scalaIo = "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3"

  lazy val nsaCore = (
    project in file("nsa-core")
    settings(defaultSettings: _*)
    settings(
      libraryDependencies ++= Seq(
        specs2 % "test"
      , scalaIo % "test"
      )
    )
  )

  lazy val nsaDsl = (
    project in file("nsa-dsl")
    settings(defaultSettings: _*)
    settings(
      libraryDependencies ++= Seq(
        specs2 % "test"
      , scalaIo % "test"
      )
    )
  ) dependsOn(nsaCore)

  // -----------------------------------------------------------------------------------------------------

  import ScriptedPlugin._

  lazy val nsaPlugin = (
    project in file("nsa-plugin")
    settings(defaultSettings: _*)
    settings(scriptedSettings: _*) settings(
      sbtPlugin := true
    , scriptedLaunchOpts += "-Dproject.version=" + version.value
    )
  ) dependsOn(nsaDsl)

  // -----------------------------------------------------------------------------------------------------

  lazy val root = (
    project in file(".")
    settings(defaultSettings: _*)
    settings(
      publishArtifact := false
    )
  ) aggregate(nsaCore, nsaDsl, nsaPlugin)
}
