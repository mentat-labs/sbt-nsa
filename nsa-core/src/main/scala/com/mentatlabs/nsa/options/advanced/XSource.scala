package com.mentatlabs.nsa

/** Treat compiler input as Scala source for the specified version, see SI-8126. */
object `-Xsource` {
  private val since = ScalacVersion.`2.11.0`

  case class custom(version: String)
      extends ChoiceOption("-Xsource", version) {
    def since = `-Xsource`.since
  }

  def `2`     = custom("2")
  def `2.0`   = custom("2.0")
  def `2.0.0` = custom("2.0.0")

  def `2.3`   = custom("2.3")
  def `2.3.0` = custom("2.3.0")
  def `2.3.1` = custom("2.3.1")
  def `2.3.2` = custom("2.3.2")
  def `2.3.3` = custom("2.3.3")

  def `2.4`   = custom("2.4")
  def `2.4.0` = custom("2.4.0")

  def `2.5`   = custom("2.5")
  def `2.5.0` = custom("2.5.0")
  def `2.5.1` = custom("2.5.1")

  def `2.6`   = custom("2.6")
  def `2.6.0` = custom("2.6.0")
  def `2.6.1` = custom("2.6.1")

  def `2.7`   = custom("2.7")
  def `2.7.0` = custom("2.7.0")
  def `2.7.1` = custom("2.7.1")
  def `2.7.2` = custom("2.7.2")
  def `2.7.3` = custom("2.7.3")
  def `2.7.4` = custom("2.7.4")
  def `2.7.5` = custom("2.7.5")
  def `2.7.6` = custom("2.7.6")
  def `2.7.7` = custom("2.7.7")

  def `2.8`   = custom("2.8")
  def `2.8.0` = custom("2.8.0")
  def `2.8.1` = custom("2.8.1")
  def `2.8.2` = custom("2.8.2")

  def `2.9`     = custom("2.9")
  def `2.9.0`   = custom("2.9.0")
  def `2.9.0-1` = custom("2.9.0-1")
  def `2.9.1`   = custom("2.9.1")
  def `2.9.1-1` = custom("2.9.1-1")
  def `2.9.2`   = custom("2.9.2")
  def `2.9.3`   = custom("2.9.3")

  def `2.10`   = custom("2.10")
  def `2.10.0` = custom("2.10.0")
  def `2.10.1` = custom("2.10.1")
  def `2.10.2` = custom("2.10.2")
  def `2.10.3` = custom("2.10.3")
  def `2.10.4` = custom("2.10.4")

  def `2.11`   = custom("2.11")
  def `2.11.0` = custom("2.11.0")
  def `2.11.1` = custom("2.11.1")
  def `2.11.2` = custom("2.11.2")
  def `2.11.3` = custom("2.11.3")
  def `2.11.4` = custom("2.11.4")

  def `2.12`   = custom("2.12")
  def `2.12.0` = custom("2.12.0")
}
