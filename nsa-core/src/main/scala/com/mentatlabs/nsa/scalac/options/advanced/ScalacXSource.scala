package com.mentatlabs.nsa
package scalac
package options

/* -Xsource:<version>
 * ==================
 *   2.11.0 - 2.12.0: Treat compiler input as Scala source for the specified version, see SI-8126.
 */
object ScalacXSource
    extends ScalacOptionChoiceContainer[String]("-Xsource", ScalacVersions.`2.11.0`) {

  def apply(sv: scalac.ScalacVersion) =
    custom(sv)

  val `2`     = apply("2")
  val `2.0`   = apply("2.0")
  val `2.0.0` = apply("2.0.0")

  val `2.1`   = apply("2.1")
  val `2.1.0` = apply("2.1.0")
  val `2.1.1` = apply("2.1.1")
  val `2.1.2` = apply("2.1.2")
  val `2.1.3` = apply("2.1.3")
  val `2.1.4` = apply("2.1.4")
  val `2.1.5` = apply("2.1.5")
  val `2.1.6` = apply("2.1.6")
  val `2.1.7` = apply("2.1.7")
  val `2.1.8` = apply("2.1.8")

  val `2.2`   = apply("2.2")
  val `2.2.0` = apply("2.2.0")

  val `2.3`   = apply("2.3")
  val `2.3.0` = apply("2.3.0")
  val `2.3.1` = apply("2.3.1")
  val `2.3.2` = apply("2.3.2")
  val `2.3.3` = apply("2.3.3")

  val `2.4`   = apply("2.4")
  val `2.4.0` = apply("2.4.0")

  val `2.5`   = apply("2.5")
  val `2.5.0` = apply("2.5.0")
  val `2.5.1` = apply("2.5.1")

  val `2.6`   = apply("2.6")
  val `2.6.0` = apply("2.6.0")
  val `2.6.1` = apply("2.6.1")

  val `2.7`   = apply("2.7")
  val `2.7.0` = apply("2.7.0")
  val `2.7.1` = apply("2.7.1")
  val `2.7.2` = apply("2.7.2")
  val `2.7.3` = apply("2.7.3")
  val `2.7.4` = apply("2.7.4")
  val `2.7.5` = apply("2.7.5")
  val `2.7.6` = apply("2.7.6")
  val `2.7.7` = apply("2.7.7")

  val `2.8`   = apply("2.8")
  val `2.8.0` = apply("2.8.0")
  val `2.8.1` = apply("2.8.1")
  val `2.8.2` = apply("2.8.2")

  val `2.9`     = apply("2.9")
  val `2.9.0`   = apply("2.9.0")
  val `2.9.0-1` = apply("2.9.0-1")
  val `2.9.1`   = apply("2.9.1")
  val `2.9.1-1` = apply("2.9.1-1")
  val `2.9.2`   = apply("2.9.2")
  val `2.9.3`   = apply("2.9.3")

  val `2.10`   = apply("2.10")
  val `2.10.0` = apply("2.10.0")
  val `2.10.1` = apply("2.10.1")
  val `2.10.2` = apply("2.10.2")
  val `2.10.3` = apply("2.10.3")
  val `2.10.4` = apply("2.10.4")
  val `2.10.5` = apply("2.10.5")
  val `2.10.6` = apply("2.10.6")

  val `2.11`   = apply("2.11")
  val `2.11.0` = apply("2.11.0")
  val `2.11.1` = apply("2.11.1")
  val `2.11.2` = apply("2.11.2")
  val `2.11.3` = apply("2.11.3")
  val `2.11.4` = apply("2.11.4")
  val `2.11.5` = apply("2.11.5")
  val `2.11.6` = apply("2.11.6")
  val `2.11.7` = apply("2.11.7")
  val `2.11.8` = apply("2.11.8")

  val `2.12`   = apply("2.12")
  val `2.12.0` = apply("2.12.0")
}
