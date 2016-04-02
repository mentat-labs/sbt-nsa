def commonSettings = Seq(
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

lazy val `nsa-core` = project settings(commonSettings)
lazy val `nsa-dsl` = project settings(commonSettings) dependsOn(`nsa-core`)

def aggregatedCompile = ScopeFilter(inProjects(`nsa-core`, `nsa-dsl`), inConfigurations(Compile))
def aggregatedTest = ScopeFilter(inProjects(`nsa-core`, `nsa-dsl`), inConfigurations(Test))

lazy val `sbt-nsa` = (
  project in file(".")
  settings(commonSettings)
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
  settings(scriptedSettings)
  settings(
    sbtPlugin := true
  , scriptedLaunchOpts += "-Dproject.version=" + version.value
  )
)
