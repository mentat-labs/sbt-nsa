package hr.element.sbt.nsa

object `-g` {
  def custom(level: String) = ValueSetting("-g", level)

  def none = custom("none")
  def source = custom("source")
  def line = custom("line")
  def vars = custom("vars")
  def notailcalls = custom("notailcalls")
}