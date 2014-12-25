package com.mentatlabs.nsa

/** Print compiler statistics for specific phases. */
object `-Ystatistics` {
  private val since = ScalacVersion.`2.6.0`

  case class custom(phase: String)
      extends ChoiceOption("-Ystatistics", phase) {
    val since = `-Ystatistics`.since
  }

  def `_` = custom("_")
  def `help` = custom("help")

  def `parser` = custom("parser")
  def `-parser` = custom("-parser")

  def `typer` = custom("typer")
  def `-typer` = custom("-typer")

  def `patmat` = custom("patmat")
  def `-patmat` = custom("-patmat")

  def `erasure` = custom("erasure")
  def `-erasure` = custom("-erasure")

  def `cleanup` = custom("cleanup")
  def `-cleanup` = custom("-cleanup")

  def `jvm` = custom("jvm")
  def `-jvm` = custom("-jvm")

  def `FooBar` = custom("FooBar")
  def `-FooBar` = custom("-FooBar")
}
