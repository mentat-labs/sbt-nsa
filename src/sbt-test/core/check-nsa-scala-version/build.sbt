enablePlugins(NsaPlugin)

TaskKey[Unit]("check-typed-scalac-version") := {
  val expected = scalaVersion.value
  val actual = nsaScalaVersion.value.toString

  if (expected != actual)
    sys.error(s"Invalid nsaScalaVersion (expected $expected, but got $actual)")

  ()
}
