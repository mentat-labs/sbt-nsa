package com.mentatlabs.nsa

/** Skip <phases>. */
object `-Yskip` {
  private val since = ScalacVersion.`2.6.0`

  case class custom(phases: String)
      extends ChoiceOption("-Yskip", phases) {
    val since = `-Yskip`.since
  }

  def `typer` = custom("typer")
  def `patmat` = custom("patmat")
  def `erasure` = custom("erasure")
  def `cleanup` = custom("cleanup")
  def `jvm` = custom("jvm")
  def `FooBar` = custom("FooBar")
}
