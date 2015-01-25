package com.mentatlabs.nsa
package scalac
package options

/** -language:<_,feature,-feature>
  * ==============================
  *   2.10.0 - 2.11.0: Enable one or more language features.
  *            2.11.1: Enable one or more language features: dynamics,postfixOps,reflectiveCalls,implicitConversions,higherKinds,existentials,experimental.macros.
  *   2.11.2 - 2.12.0: Enable or disable language features: `_' for all, `-language:help' to list
  */
object ScalacLanguage extends ScalacOptionChoiceContainer[String]("-language", `2.10.0`) {
  def `_` = apply("_")
  def help = apply("help")

  def dynamics = apply("dynamics")
  def `-dynamics` = apply("-dynamics")

  def postfixOps = apply("postfixOps")
  def `-postfixOps` = apply("-postfixOps")

  def reflectiveCalls = apply("reflectiveCalls")
  def `-reflectiveCalls` = apply("-reflectiveCalls")

  def implicitConversions = apply("implicitConversions")
  def `-implicitConversions` = apply("-implicitConversions")

  def existentials = apply("existentials")
  def `-existentials` = apply("-existentials")

  def `experimental.macros` = apply("experimental.macros")
  def `-experimental.macros` = apply("-experimental.macros")
}
