package hr.element.sbt.nsa

case class SinceScalaVersion(
    epoch: Int,
    major: Int,
    minor: Int,
    patch: Option[Int]) extends Ordered[SinceScalaVersion] {

  def compare(that: SinceScalaVersion) = {
    val epochDelta = epoch - that.epoch
    if (epochDelta != 0) {
      epochDelta
    }
    else {
      val majorDelta = major - that.major
      if (majorDelta != 0) {
        majorDelta
      }
      else {
        val minorDelta = minor - that.minor
        if (minorDelta != 0) {
          minorDelta
        }
        else {
          implicitly[Ordering[Option[Int]]].compare(patch, that.patch)
        }
      }
    }
  }

  override val toString = epoch + "." + major + "." + minor + patch.map("-" +).getOrElse("")
}

object SinceScalaVersion {
  def apply(epoch: Int, major: Int, minor: Int): SinceScalaVersion =
    SinceScalaVersion(epoch, major, minor, None)

  def apply(epoch: Int, major: Int, minor: Int, patch: Int): SinceScalaVersion =
    SinceScalaVersion(epoch, major, minor, Some(patch))
}

trait SinceScalaVersions {
  implicit def toSomeSinceScalaVersion(ssv: SinceScalaVersion) = Some(ssv)

  val `2.0.0` = SinceScalaVersion(2, 0, 0)

  val `2.3.0` = SinceScalaVersion(2, 3, 0)
  val `2.3.1` = SinceScalaVersion(2, 3, 1)
  val `2.3.2` = SinceScalaVersion(2, 3, 2)
  val `2.3.3` = SinceScalaVersion(2, 3, 3)

  val `2.4.0` = SinceScalaVersion(2, 4, 0)

  val `2.5.0` = SinceScalaVersion(2, 5, 0)
  val `2.5.1` = SinceScalaVersion(2, 5, 1)

  val `2.6.0` = SinceScalaVersion(2, 6, 0)
  val `2.6.1` = SinceScalaVersion(2, 6, 1)

  val `2.7.0` = SinceScalaVersion(2, 7, 0)
  val `2.7.1` = SinceScalaVersion(2, 7, 1)
  val `2.7.2` = SinceScalaVersion(2, 7, 2)
  val `2.7.3` = SinceScalaVersion(2, 7, 3)
  val `2.7.4` = SinceScalaVersion(2, 7, 4)
  val `2.7.5` = SinceScalaVersion(2, 7, 5)
  val `2.7.6` = SinceScalaVersion(2, 7, 6)
  val `2.7.7` = SinceScalaVersion(2, 7, 7)

  val `2.8.0` = SinceScalaVersion(2, 8, 0)
  val `2.8.1` = SinceScalaVersion(2, 8, 1)
  val `2.8.2` = SinceScalaVersion(2, 8, 2)

  val `2.9.0`   = SinceScalaVersion(2, 9, 0)
  val `2.9.0-1` = SinceScalaVersion(2, 9, 0, 1)
  val `2.9.1`   = SinceScalaVersion(2, 9, 1)
  val `2.9.1-1` = SinceScalaVersion(2, 9, 1, 1)
  val `2.9.2`   = SinceScalaVersion(2, 9, 2)
  val `2.9.3`   = SinceScalaVersion(2, 9, 3)

  val `2.10.0` = SinceScalaVersion(2, 10, 0)
  val `2.10.1` = SinceScalaVersion(2, 10, 1)
  val `2.10.2` = SinceScalaVersion(2, 10, 2)
  val `2.10.3` = SinceScalaVersion(2, 10, 3)
  val `2.10.4` = SinceScalaVersion(2, 10, 4)

  val `2.11.0` = SinceScalaVersion(2, 11, 0)
  val `2.11.1` = SinceScalaVersion(2, 11, 1)
  val `2.11.2` = SinceScalaVersion(2, 11, 2)
  val `2.11.3` = SinceScalaVersion(2, 11, 3)
  val `2.11.4` = SinceScalaVersion(2, 11, 4)

  val `2.12.0` = SinceScalaVersion(2, 12, 0)
}
