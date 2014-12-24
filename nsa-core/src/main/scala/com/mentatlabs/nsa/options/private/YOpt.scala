package com.mentatlabs.nsa

/** Enable optimizations. */
object `-Yopt` {
  private val since = ScalacVersion.`2.11.3`

  case class custom(optimization: String)
      extends ChoiceOption("-Yopt", optimization) {
    val since = `-Yopt`.since
  }

  def `_` = custom("_")
  def `help` = custom("help")

  def `unreachable-code` = custom("unreachable-code")
  def `-unreachable-code` = custom("-unreachable-code")

  def `l:none` = custom("l:none")
  def `-l:none` = custom("-l:none")

  def `l:default` = custom("l:default")

  def `l:method` = custom("l:method")

  def `l:project` = custom("l:project")

  def `l:classpath` = custom("l:classpath")
}
