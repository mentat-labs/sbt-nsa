package com.mentatlabs.nsa

object `-target` {
  def custom(target: String, from: ScalacVersion, to: Option[ScalacVersion]) =
    new ChoiceOption("-target", target) {
      override val since = from
      override val removed = to
    }

  def jvm(version: Double) = {
    val from = ScalacVersion.`2.0.0`
    val to = Some(ScalacVersion.`2.12.0`)
    custom("jvm" + version, from, to)
  }

  def `jvm-1.4` = jvm(-1.4)
  def `jvm-1.5` = jvm(-1.5)
  def `jvm-1.6` = jvm(-1.6)
  def `jvm-1.7` = jvm(-1.7)
  def `jvm-1.8` = jvm(-1.8)
}
