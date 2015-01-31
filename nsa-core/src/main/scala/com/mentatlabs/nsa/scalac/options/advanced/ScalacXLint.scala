package com.mentatlabs.nsa
package scalac
package options

/** -Xlint:<_,warning,-warning>
  * ======
  *    2.9.1 - 2.11.1: Enable recommended additional warnings.
  *   2.11.2 - 2.12.0: Enable or disable specific warnings: `_' for all, `-Xlint:help' to list
  */
object ScalacXLint
    extends ScalacOptionChoiceContainer[String]("-Xlint", ScalacVersions.`2.9.1`)
    with ScalacOptionEmptyChoice {

  def `_` = apply("_")
  def help = apply("help")

  def `adapted-args` = apply("adapted-args")
  def `-adapted-args` = apply("-adapted-args")

  def `nullary-unit` = apply("nullary-unit")
  def `-nullary-unit` = apply("-nullary-unit")

  def inaccessible = apply("inaccessible")
  def `-inaccessible` = apply("-inaccessible")

  def `nullary-override` = apply("nullary-override")
  def `-nullary-override` = apply("-nullary-override")

  def `infer-any` = apply("infer-any")
  def `-infer-any` = apply("-infer-any")

  def `missing-interpolator` = apply("missing-interpolator")
  def `-missing-interpolator` = apply("-missing-interpolator")

  def `doc-detached` = apply("doc-detached")
  def `-doc-detached` = apply("-doc-detached")

  def `private-shadow` = apply("private-shadow")
  def `-private-shadow` = apply("-private-shadow")

  def `type-parameter-shadow` = apply("type-parameter-shadow")
  def `-type-parameter-shadow` = apply("-type-parameter-shadow")

  def `poly-implicit-overload` = apply("poly-implicit-overload")
  def `-poly-implicit-overload` = apply("-poly-implicit-overload")

  def `option-implicit` = apply("option-implicit")
  def `-option-implicit` = apply("-option-implicit")

  def `delayedinit-select` = apply("delayedinit-select")
  def `-delayedinit-select` = apply("-delayedinit-select")

  def `by-name-right-associative` = apply("by-name-right-associative")
  def `-by-name-right-associative` = apply("-by-name-right-associative")

  def `package-object-classes` = apply("package-object-classes")
  def `-package-object-classes` = apply("-package-object-classes")

  def `unsound-match` = apply("unsound-match")
  def `-unsound-match` = apply("-unsound-match")
}
