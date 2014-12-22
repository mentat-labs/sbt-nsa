package com.mentatlabs.nsa

/** Set level of generated debugging info. */
object `-g` {
  private val since = ScalacVersion.`2.0.0`

  case class custom(level: String)
      extends ChoiceOption("-g", level) {
    val since = `-g`.since
  }

  def none = custom("none")
  def source = custom("source")
  def line = custom("line")
  def vars = custom("vars")
  def notailcalls = custom("notailcalls")
}
