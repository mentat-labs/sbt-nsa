package hr.element.nsa

object `-g` {
  def custom(level: String) = ValueOption("-g", level)

  def none = custom("none")
  def source = custom("source")
  def line = custom("line")
  def vars = custom("vars")
  def notailcalls = custom("notailcalls")
}
