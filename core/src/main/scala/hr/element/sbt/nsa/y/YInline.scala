package hr.element.sbt.nsa

case object `-Yinline` extends JustSetting {
  def -(h: dsl.handlers.type) = `-Yinline-handlers`
  def -(w: dsl.warnings.type) = `-Yinline-warnings`
}
