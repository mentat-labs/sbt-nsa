package com.mentatlabs.nsa

/** Enable or disable specific warnings: `_' for all, `-Xlint:help' to list */
case object `-Xlint` {
  case class custom(feature: String)
    extends ChoiceOption("-Xlint", feature) {
    val since = ScalacVersion.`2.9.1`
  }

  def `_` = custom("_")
  def `help` = custom("help")

  def `adapted-args` = custom("adapted-args")
  def `-adapted-args` = custom("-adapted-args")

  def `nullary-unit` = custom("nullary-unit")
  def `-nullary-unit` = custom("-nullary-unit")

  def `inaccessible` = custom("inaccessible")
  def `-inaccessible` = custom("-inaccessible")

  def `nullary-override` = custom("nullary-override")
  def `-nullary-override` = custom("-nullary-override")

  def `infer-any` = custom("infer-any")
  def `-infer-any` = custom("-infer-any")

  def `missing-interpolator` = custom("missing-interpolator")
  def `-missing-interpolator` = custom("-missing-interpolator")

  def `doc-detached` = custom("doc-detached")
  def `-doc-detached` = custom("-doc-detached")

  def `private-shadow` = custom("private-shadow")
  def `-private-shadow` = custom("-private-shadow")

  def `type-parameter-shadow` = custom("type-parameter-shadow")
  def `-type-parameter-shadow` = custom("-type-parameter-shadow")

  def `poly-implicit-overload` = custom("poly-implicit-overload")
  def `-poly-implicit-overload` = custom("-poly-implicit-overload")

  def `option-implicit` = custom("option-implicit")
  def `-option-implicit` = custom("-option-implicit")

  def `delayedinit-select` = custom("delayedinit-select")
  def `-delayedinit-select` = custom("-delayedinit-select")

  def `by-name-right-associative` = custom("by-name-right-associative")
  def `-by-name-right-associative` = custom("-by-name-right-associative")

  def `package-object-classes` = custom("package-object-classes")
  def `-package-object-classes` = custom("-package-object-classes")

  def `unsound-match` = custom("unsound-match")
  def `-unsound-match` = custom("-unsound-match")
}
