package com.mentatlabs.nsa
package scalac

case class ScalacVersion(
    epoch: Int,
    major: Int,
    minor: Int,
    patch: Option[Int],
    extra: Option[String]) extends Ordered[ScalacVersion] {

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
          // Version with patch will rank higher than final (clean) versions
          val patchDelta = Ordering[Option[Int]].compare(patch, that.patch)
          if (patchDelta != 0) {
            patchDelta
          }
          else {
            // Versions with any extra will rank lower than final (clean) version
            (extra, that.extra) match {
              case (None, None) => 0
              case (Some(x), None) => -1
              case (None, Some(y)) => 1
              // Milestones will come before RCs because of String ordering */
              case (Some(x), Some(y)) => x.compareTo(y)
            }
          }
        }
      }
    }
  }

  override val toString = (
    epoch + "." + major + "." + minor
  + patch.map("-" +).getOrElse("")
  + extra.map("-" +).getOrElse("")
  )
}

object ScalacVersion {
  def apply(epoch: Int, major: Int, minor: Int): ScalacVersion =
    ScalacVersion(epoch, major, minor, None, None)

  def apply(epoch: Int, major: Int, minor: Int, patch: Int): ScalacVersion =
    ScalacVersion(epoch, major, minor, Some(patch), None)

  private val ScalacVersionPattern = """(\d+?)\.(\d+?)\.(\d+?)(?:-(\d+?))?(?:-(\w+?))?""" r

  def apply(scalacVersion: String): Option[ScalacVersion] = util.Try {
    val ScalacVersionPattern(epochStr, majorStr, minorStr, patchStr, extraStr) = scalacVersion

    ScalacVersion(
      epoch = epochStr.toInt
    , major = majorStr.toInt
    , minor = minorStr.toInt
    , patch = Option(patchStr).map(_.toInt)
    , extra = Option(extraStr)
    )
  }.toOption
}
