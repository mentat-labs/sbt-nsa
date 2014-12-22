package com.mentatlabs.nsa

/** Enable or disable language features: `_' for all, `-language:help' to list */
object `-language` {
  private val since = ScalacVersion.`2.10.0`

  case class custom(feature: String)
      extends ChoiceOption("-language", feature) {
    val since = `-language`.since
  }

  def `_` = custom("_")
  def `help` = custom("help")

  def `dynamics` = custom("dynamics")
  def `-dynamics` = custom("-dynamics")

  def `postfixOps` = custom("postfixOps")
  def `-postfixOps` = custom("-postfixOps")

  def `reflectiveCalls` = custom("reflectiveCalls")
  def `-reflectiveCalls` = custom("-reflectiveCalls")

  def `implicitConversions` = custom("implicitConversions")
  def `-implicitConversions` = custom("-implicitConversions")

  def `existentials` = custom("existentials")
  def `-existentials` = custom("-existentials")

  def `experimental.macros` = custom("experimental.macros")
  def `-experimental.macros` = custom("-experimental.macros")
}
