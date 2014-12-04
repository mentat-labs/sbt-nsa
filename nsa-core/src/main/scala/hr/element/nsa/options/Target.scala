package hr.element.nsa

object `-target` {
  def custom(target: String) = ChoiceSetting("-target", target)

  def jvm(version: Double) = custom("jvm" + version)

  def `jvm-1.5` = jvm(-1.5)
  def `jvm-1.6` = jvm(-1.6)
  def `jvm-1.7` = jvm(-1.7)
  def `jvm-1.8` = jvm(-1.8)
}
