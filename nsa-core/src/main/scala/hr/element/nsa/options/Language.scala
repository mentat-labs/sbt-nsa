package hr.element.nsa

object `-language` {
  def custom(feature: String) = ChoiceSetting("-language", feature)

  def `_` = custom("_")
  def `help` = custom("help")

  def `dynamics` = custom("dynamics")
  def `-dynamics` = custom("-dynamics")

  def `postfixOps` = custom("postfixOps")
  def `-postfixOps` = custom("postfixOps")

  def `reflectiveCalls` = custom("reflectiveCalls")
  def `-reflectiveCalls` = custom("-reflectiveCalls")

  def `implicitConversions` = custom("implicitConversions")
  def `-implicitConversions` = custom("-implicitConversions")

  def `existentials` = custom("existentials")
  def `-existentials` = custom("existentials")

  def `experimental.macros` = custom("experimental.macros")
  def `-experimental.macros` = custom("-experimental.macros")
}
