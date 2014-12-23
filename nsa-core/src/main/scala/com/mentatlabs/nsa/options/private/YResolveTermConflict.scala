package com.mentatlabs.nsa

/** Resolve term conflicts */
object `-Yresolve-term-conflict` {
  private val since = ScalacVersion.`2.9.1`

  case class custom(strategy: String)
    extends ChoiceOption("-Yresolve-term-conflict", strategy) {
    val since = `-Yresolve-term-conflict`.since
  }

  def `package` = custom("package")
  def `object` = custom("object")
  def error = custom("error")
}
