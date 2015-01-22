package com.mentatlabs.nsa
package scalac
package options

/** -Xsource:<version>
  * ==================
  *   2.11.0 - 2.12.0: Treat compiler input as Scala source for the specified version, see SI-8126.
  */
object ScalacXSource
    extends ScalacOptionChoiceContainer("-Xsource", `2.11.0`) {

  def `2`     = apply("2")
  def `2.0`   = apply("2.0")
  def `2.0.0` = apply("2.0.0")

  def `2.3`   = apply("2.3")
  def `2.3.0` = apply("2.3.0")
  def `2.3.1` = apply("2.3.1")
  def `2.3.2` = apply("2.3.2")
  def `2.3.3` = apply("2.3.3")

  def `2.4`   = apply("2.4")
  def `2.4.0` = apply("2.4.0")

  def `2.5`   = apply("2.5")
  def `2.5.0` = apply("2.5.0")
  def `2.5.1` = apply("2.5.1")

  def `2.6`   = apply("2.6")
  def `2.6.0` = apply("2.6.0")
  def `2.6.1` = apply("2.6.1")

  def `2.7`   = apply("2.7")
  def `2.7.0` = apply("2.7.0")
  def `2.7.1` = apply("2.7.1")
  def `2.7.2` = apply("2.7.2")
  def `2.7.3` = apply("2.7.3")
  def `2.7.4` = apply("2.7.4")
  def `2.7.5` = apply("2.7.5")
  def `2.7.6` = apply("2.7.6")
  def `2.7.7` = apply("2.7.7")

  def `2.8`   = apply("2.8")
  def `2.8.0` = apply("2.8.0")
  def `2.8.1` = apply("2.8.1")
  def `2.8.2` = apply("2.8.2")

  def `2.9`     = apply("2.9")
  def `2.9.0`   = apply("2.9.0")
  def `2.9.0-1` = apply("2.9.0-1")
  def `2.9.1`   = apply("2.9.1")
  def `2.9.1-1` = apply("2.9.1-1")
  def `2.9.2`   = apply("2.9.2")
  def `2.9.3`   = apply("2.9.3")

  def `2.10`   = apply("2.10")
  def `2.10.0` = apply("2.10.0")
  def `2.10.1` = apply("2.10.1")
  def `2.10.2` = apply("2.10.2")
  def `2.10.3` = apply("2.10.3")
  def `2.10.4` = apply("2.10.4")

  def `2.11`   = apply("2.11")
  def `2.11.0` = apply("2.11.0")
  def `2.11.1` = apply("2.11.1")
  def `2.11.2` = apply("2.11.2")
  def `2.11.3` = apply("2.11.3")
  def `2.11.4` = apply("2.11.4")
  def `2.11.5` = apply("2.11.5")

  def `2.12`   = apply("2.12")
  def `2.12.0` = apply("2.12.0")
}
