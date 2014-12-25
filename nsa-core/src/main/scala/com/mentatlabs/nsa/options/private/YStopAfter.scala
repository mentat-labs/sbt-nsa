package com.mentatlabs.nsa

/** Stop before <phases>. */
object `-Ystop-after` {
  private val since = ScalacVersion.`2.9.0`

  case class custom(phases: String)
      extends ChoiceOption("-Ystop-after", phases) {
    val since = `-Ystop-after`.since
  }

  def `parser` = custom("parser")
  def `typer` = custom("typer")
  def `patmat` = custom("patmat")
  def `erasure` = custom("erasure")
  def `cleanup` = custom("cleanup")
  def `jvm` = custom("jvm")
  def `FooBar` = custom("FooBar")
}
