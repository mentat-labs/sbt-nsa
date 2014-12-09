import sbt._
import Keys._

object Build extends Build {
  val ElementReleases  = "Element Releases"  at "http://repo.element.hr/nexus/content/repositories/releases/"
  val ElementSnapshots = "Element Snapshots" at "http://repo.element.hr/nexus/content/repositories/snapshots/"

  private def defaultSettings =
    Defaults.defaultSettings ++ Seq(
      organization := "hr.element.nsa"

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

  lazy val nsaCore = Project(
    "nsa-core"
  , file("nsa-core")
  , settings = defaultSettings ++ Seq(
      initialCommands in console := "import hr.element.nsa._"
    )
  )

  lazy val nsaDsl = Project(
    "nsa-dsl"
  , file("nsa-dsl")
  , dependencies = Seq(nsaCore)
  , settings = defaultSettings ++ Seq(
      initialCommands in console := "import hr.element.nsa._, experimental_dsl._"
    )
  )

  lazy val root = Project(
    "root"
  , file(".")
  , aggregate = Seq(nsaCore, nsaDsl)
  , settings = defaultSettings ++ Seq(
      publishArtifact := false
    )
  )
}
