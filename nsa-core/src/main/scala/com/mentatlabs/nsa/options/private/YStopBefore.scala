package com.mentatlabs.nsa

/** Stop before <phases>. */
object `-Ystop-before` {
  private val since = ScalacVersion.`2.9.0`

  case class custom(phases: String)
      extends ChoiceOption("-Ystop-before", phases) {
    val since = `-Ystop-before`.since
  }

  def `typer` = custom("typer")
  def `patmat` = custom("patmat")
  def `erasure` = custom("erasure")
  def `cleanup` = custom("cleanup")
  def `jvm` = custom("jvm")
  def `FooBar` = custom("FooBar")
}
