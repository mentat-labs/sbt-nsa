package com.mentatlabs.nsa

import scala.util._

case class ScalacVersion(
    epoch: Int,
    major: Int,
    minor: Int,
    patch: Option[Int]) extends Ordered[ScalacVersion] {

  def compare(that: ScalacVersion) = {
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

trait ScalacVersionRange {
  def since: ScalacVersion = ScalacVersion.`2.0.0`
  def deprecated: Option[ScalacVersion] = None
  def removed: Option[ScalacVersion] = None

  def isDefinedAt(scalaVersion: ScalacVersion) =
    since <= scalaVersion && !removed.exists { _ <= scalaVersion }
}

object ScalacVersion {
  def apply(epoch: Int, major: Int): ScalacVersion =
    ScalacVersion(epoch, major, 0, None)

  def apply(epoch: Int, major: Int, minor: Int): ScalacVersion =
    ScalacVersion(epoch, major, minor, None)

  def apply(epoch: Int, major: Int, minor: Int, patch: Int): ScalacVersion =
    ScalacVersion(epoch, major, minor, Some(patch))

  private val ScalacVersionPattern = """(\d+?)\.(\d+?)\.(\d+?)(?:-(\d+?))?"""r
  def apply(scalaVersion: String): Option[ScalacVersion] = Try {
    val ScalacVersionPattern(epochStr, majorStr, minorStr, patchStr) = scalaVersion
    val epoch = epochStr.toInt
    val major = majorStr.toInt
    val minor = minorStr.toInt
    val patch = if (patchStr == null) None else Some(patchStr.toInt)
    ScalacVersion(epoch, major, minor, patch)
  }.toOption

  // --- cut here --- generated code below --- cut here ---

  val `2.0.0` = ScalacVersion(2, 0)

  val `2.3.0` = ScalacVersion(2, 3)
  val `2.3.1` = ScalacVersion(2, 3, 1)
  val `2.3.2` = ScalacVersion(2, 3, 2)
  val `2.3.3` = ScalacVersion(2, 3, 3)

  val `2.4.0` = ScalacVersion(2, 4)

  val `2.5.0` = ScalacVersion(2, 5)
  val `2.5.1` = ScalacVersion(2, 5, 1)

  val `2.6.0` = ScalacVersion(2, 6)
  val `2.6.1` = ScalacVersion(2, 6, 1)

  val `2.7.0` = ScalacVersion(2, 7)
  val `2.7.1` = ScalacVersion(2, 7, 1)
  val `2.7.2` = ScalacVersion(2, 7, 2)
  val `2.7.3` = ScalacVersion(2, 7, 3)
  val `2.7.4` = ScalacVersion(2, 7, 4)
  val `2.7.5` = ScalacVersion(2, 7, 5)
  val `2.7.6` = ScalacVersion(2, 7, 6)
  val `2.7.7` = ScalacVersion(2, 7, 7)

  val `2.8.0` = ScalacVersion(2, 8)
  val `2.8.1` = ScalacVersion(2, 8, 1)
  val `2.8.2` = ScalacVersion(2, 8, 2)

  val `2.9.0`   = ScalacVersion(2, 9)
  val `2.9.0-1` = ScalacVersion(2, 9, 0, 1)
  val `2.9.1`   = ScalacVersion(2, 9, 1)
  val `2.9.1-1` = ScalacVersion(2, 9, 1, 1)
  val `2.9.2`   = ScalacVersion(2, 9, 2)
  val `2.9.3`   = ScalacVersion(2, 9, 3)

  val `2.10.0` = ScalacVersion(2, 10)
  val `2.10.1` = ScalacVersion(2, 10, 1)
  val `2.10.2` = ScalacVersion(2, 10, 2)
  val `2.10.3` = ScalacVersion(2, 10, 3)
  val `2.10.4` = ScalacVersion(2, 10, 4)

  val `2.11.0` = ScalacVersion(2, 11)
  val `2.11.1` = ScalacVersion(2, 11, 1)
  val `2.11.2` = ScalacVersion(2, 11, 2)
  val `2.11.3` = ScalacVersion(2, 11, 3)
  val `2.11.4` = ScalacVersion(2, 11, 4)

  val `2.12.0` = ScalacVersion(2, 12)
}
