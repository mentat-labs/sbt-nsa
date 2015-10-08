import sbt._
import Keys._

import scala.language.postfixOps

object Build extends Build {
  private def defaultSettings = Seq(
    organization := "com.mentatlabs.nsa"

  , libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "2.4.15" % "test"
    , "com.github.scala-incubator.io" %% "scala-io-file" % (
        CrossVersion.partialVersion(scalaVersion.value) match {
          case Some((2, 11)) => "0.4.3-1"
          case _             => "0.4.3"
        }) % "test"
    )

  , unmanagedSourceDirectories in Compile := Seq(scalaSource in Compile value)
  , unmanagedSourceDirectories in Test := Seq(scalaSource in Test value)

  , publishArtifact in (Compile, packageDoc) := false
  )

  // -----------------------------------------------------------------------------------------------------

  lazy val nsaCore = (
    project in file("nsa-core")
    settings(defaultSettings: _*)
  )

  lazy val nsaDsl = (
    project in file("nsa-dsl")
    settings(defaultSettings: _*)
  ) dependsOn(nsaCore)

  // -----------------------------------------------------------------------------------------------------

  import ScriptedPlugin._

  def aggregatedCompile = ScopeFilter(inProjects(nsaCore, nsaDsl), inConfigurations(Compile))
  def aggregatedTest = ScopeFilter(inProjects(nsaCore, nsaDsl), inConfigurations(Test))

  lazy val sbtNsa = (
    project in file(".")
    settings(defaultSettings: _*)
    settings(
      sources in Compile ++= sources.all(aggregatedCompile).value.flatten
    , unmanagedSources in Compile ++= unmanagedSources.all(aggregatedCompile).value.flatten
    , unmanagedSourceDirectories in Compile ++= unmanagedSourceDirectories.all(aggregatedCompile).value.flatten
    , unmanagedResourceDirectories in Compile ++= unmanagedResourceDirectories.all(aggregatedCompile).value.flatten
    , sources in Test ++= sources.all(aggregatedTest).value.flatten
    , unmanagedSources in Test ++= unmanagedSources.all(aggregatedTest).value.flatten
    , unmanagedSourceDirectories in Test ++= unmanagedSourceDirectories.all(aggregatedTest).value.flatten
    , unmanagedResourceDirectories in Test ++= unmanagedResourceDirectories.all(aggregatedTest).value.flatten
    )
    settings (scriptedSettings: _*)
    settings(
      sbtPlugin := true
    , scriptedLaunchOpts += "-Dproject.version=" + version.value
    )
  )
}
