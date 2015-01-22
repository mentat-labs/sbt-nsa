import sbt._
import Keys._

object Build extends Build {
  private def defaultSettings =
    Defaults.coreDefaultSettings ++ Seq(
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

  lazy val nsaCore = Project(
    "nsa-core"
  , file("nsa-core")
  , settings = defaultSettings ++ Seq(
      initialCommands in console := "import com.mentatlabs.nsa._"
    , libraryDependencies ++= Seq(
        specs2 % "test"
      , scalaIo % "test"
      )
    )
  )

  lazy val nsaDsl = Project(
    "nsa-dsl"
  , file("nsa-dsl")
  , dependencies = Seq(nsaCore)
  , settings = defaultSettings ++ Seq(
      initialCommands in console := "import com.mentatlabs.nsa._, experimental_dsl._"
    , libraryDependencies ++= Seq(
        specs2 % "test"
      )
    )
  )

  // -----------------------------------------------------------------------------------------------------

  lazy val root = Project(
    "root"
  , file(".")
  , aggregate = Seq(nsaCore, nsaDsl)
  , settings = defaultSettings ++ Seq(
      publishArtifact := false
    )
  )
}
