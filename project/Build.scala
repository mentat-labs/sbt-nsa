import sbt._
import Keys._

object Build extends Build {
  val ElementReleases  = "Element Releases"  at "http://repo.element.hr/nexus/content/repositories/releases/"
  val ElementSnapshots = "Element Snapshots" at "http://repo.element.hr/nexus/content/repositories/snapshots/"

  private def defaultSettings =
    Defaults.defaultSettings ++ Seq(
      organization := "hr.element.sbt"

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

    , publishArtifact in (Compile, packageDoc) := false
    , publishTo := Some(if (version.value endsWith "-SNAPSHOT") ElementSnapshots else ElementReleases)
    , credentials ++= {
        val creds = Path.userHome / ".config" / "sbt-nsa" / "nexus.config"
        if (creds.exists) Some(Credentials(creds)) else None
      }.toSeq
    )

  lazy val sbtNsaCore = Project(
    "sbt-nsa-core"
  , file("core")
  , settings = defaultSettings ++ Seq(
      initialCommands in console := "import hr.element.sbt.nsa._, dsl._"
    )
  )

  lazy val sbtNsaPlugin = Project(
    "sbt-nsa-plugin"
  ,  file("plugin")
  , dependencies = Seq(sbtNsaCore)
  , settings = defaultSettings ++ Seq(
      sbtPlugin := true
    )
  )

  lazy val root = Project(
    "sbt-nsa"
  , file(".")
  , aggregate = Seq(sbtNsaCore, sbtNsaPlugin)
  , settings = defaultSettings ++ Seq(
      publishArtifact := false
    )
  )
}
