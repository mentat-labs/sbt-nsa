package hr.element.sbt.nsa

case class ScalaVersion(
    epoch: Int,
    major: Int,
    minor: Int,
    patch: Option[Int]) {

  override val toString = epoch + "." + major + "." + minor + patch.map("-" +).getOrElse("")
}

object ScalaVersion {
  def apply(epoch: Int, major: Int, minor: Int): ScalaVersion =
    ScalaVersion(epoch, major, minor, None)

  def apply(epoch: Int, major: Int, minor: Int, patch: Int): ScalaVersion =
    ScalaVersion(epoch, major, minor, Some(patch))


  val `2.3.0` = ScalaVersion(2, 3, 0)
  val `2.3.1` = ScalaVersion(2, 3, 1)
  val `2.3.2` = ScalaVersion(2, 3, 2)
  val `2.3.3` = ScalaVersion(2, 3, 3)

  val `2.4.0` = ScalaVersion(2, 4, 0)

  val `2.5.0` = ScalaVersion(2, 5, 0)
  val `2.5.1` = ScalaVersion(2, 5, 1)

  val `2.6.0` = ScalaVersion(2, 6, 0)
  val `2.6.1` = ScalaVersion(2, 6, 1)

  val `2.7.0` = ScalaVersion(2, 7, 0)
  val `2.7.1` = ScalaVersion(2, 7, 1)
  val `2.7.2` = ScalaVersion(2, 7, 2)
  val `2.7.3` = ScalaVersion(2, 7, 3)
  val `2.7.4` = ScalaVersion(2, 7, 4)
  val `2.7.5` = ScalaVersion(2, 7, 5)
  val `2.7.6` = ScalaVersion(2, 7, 6)
  val `2.7.7` = ScalaVersion(2, 7, 7)

  val `2.8.0` = ScalaVersion(2, 8, 0)
  val `2.8.1` = ScalaVersion(2, 8, 1)
  val `2.8.2` = ScalaVersion(2, 8, 2)

  val `2.9.0`   = ScalaVersion(2, 9, 0)
  val `2.9.0-1` = ScalaVersion(2, 9, 0, 1)
  val `2.9.1`   = ScalaVersion(2, 9, 1)
  val `2.9.1-1` = ScalaVersion(2, 9, 1, 1)
  val `2.9.2`   = ScalaVersion(2, 9, 2)
  val `2.9.3`   = ScalaVersion(2, 9, 3)

  val `2.10.0` = ScalaVersion(2, 10, 0)
  val `2.10.1` = ScalaVersion(2, 10, 1)
  val `2.10.2` = ScalaVersion(2, 10, 2)
  val `2.10.3` = ScalaVersion(2, 10, 3)
  val `2.10.4` = ScalaVersion(2, 10, 4)

  val `2.11.0` = ScalaVersion(2, 11, 0)
  val `2.11.1` = ScalaVersion(2, 11, 1)
  val `2.11.2` = ScalaVersion(2, 11, 2)
  val `2.11.3` = ScalaVersion(2, 11, 3)
  val `2.11.4` = ScalaVersion(2, 11, 4)

  val `2.12.0` = ScalaVersion(2, 12, 0)
}
