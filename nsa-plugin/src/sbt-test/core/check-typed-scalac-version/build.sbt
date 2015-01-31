enablePlugins(NsaPlugin)

TaskKey[Unit]("check-typed-scalac-version") := {
  val expected = scalaVersion.value
  val actual = typedScalacVersion.value.toString

  if (expected != actual)
    sys.error(s"Invalid typedScalacVersion (expected $expected, but got $actual)")

  ()
}
