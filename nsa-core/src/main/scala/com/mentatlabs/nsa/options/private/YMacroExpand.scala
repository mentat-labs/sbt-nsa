package com.mentatlabs.nsa

/** Control expansion of macros, useful for scaladoc and presentation compiler */
object `-Ymacro-expand` {
  private val since = ScalacVersion.`2.11.0`

  case class custom(policy: String)
      extends ChoiceOption("-Ymacro-expand", policy) {
    val since = `-Ymacro-expand`.since
  }

  def normal = custom("normal")
  def none = custom("none")
  def discard = custom("discard")
}
