organization := "com.mentatlabs.nsa"
name := "sbt-nsa"
version := "0.0.1"

sbtPlugin := true

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "2.4.15" % "test"
, "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3" % "test"
)

// not real projects, just places to group sources by functionality
// these projects will be aggregated into the `sbt-nsa` plugin
lazy val `nsa-core` = project
lazy val `nsa-dsl` = project

unmanagedSourceDirectories in Compile := Seq((scalaSource in Compile).value)
def aggregatedCompile = ScopeFilter(inProjects(`nsa-core`, `nsa-dsl`), inConfigurations(Compile))

unmanagedSourceDirectories in Test := Seq((scalaSource in Test).value)
def aggregatedTest = ScopeFilter(inProjects(`nsa-core`, `nsa-dsl`), inConfigurations(Test))

lazy val `sbt-nsa` = (
  project in file(".")
  settings(
    sources in Compile ++= sources.all(aggregatedCompile).value.flatten
  , unmanagedSourceDirectories in Compile ++= unmanagedSourceDirectories.all(aggregatedCompile).value.flatten
  , sources in Test ++= sources.all(aggregatedTest).value.flatten
  , unmanagedSourceDirectories in Test ++= unmanagedSourceDirectories.all(aggregatedTest).value.flatten
  , unmanagedResourceDirectories in Test ++= unmanagedResourceDirectories.all(aggregatedTest).value.flatten
  )
)

scriptedSettings
scriptedLaunchOpts += "-Dproject.version=" + version.value
