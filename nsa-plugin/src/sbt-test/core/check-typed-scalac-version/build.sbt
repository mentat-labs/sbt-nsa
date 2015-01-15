name := "nsa-test-simple"
version := "0.0.0-SNAPSHOT"

scalaVersion := crossScalaVersions.value.last
crossScalaVersions := Seq(
  "2.9.1-1"
, "2.10.4-RC4"
, "2.11.0-M7"
)

enablePlugins(NsaPlugin)

TaskKey[Unit]("check-typed-scalac-version") := {
  val expected = scalaVersion.value
  val actual = typedScalacVersion.value.toString

  if (expected != actual)
    sys.error(s"Invalid typedScalacVersion (expected $expected, but got $actual)")

  ()
}
