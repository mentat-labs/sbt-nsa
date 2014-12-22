package com.mentatlabs.nsa

/** Target platform for object files. */
object `-target` {
  private val since = ScalacVersion.`2.0.0`

  case class custom(target: String)
      extends ChoiceOption("-target", target) {
    val since = `-target`.since
    override val deprecated = None // FIXME: <1.6 are deprecated in new Scalac versions
    override val removed = None // FIXME: <1.7 are removed in new Scalac versions
  }

  def jvm(version: Double) = custom("jvm" + version)
  def `jvm-1.4` = jvm(-1.4)
  def `jvm-1.5` = jvm(-1.5)
  def `jvm-1.6` = jvm(-1.6)
  def `jvm-1.7` = jvm(-1.7)
  def `jvm-1.8` = jvm(-1.8)
}
