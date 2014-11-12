package hr.element.sbt.nsa

trait TypedSetting {
  def settings: Seq[String]
}

abstract class JustSetting extends TypedSetting {
  def settings = Seq(toString)
}

case class ValueSetting[T](setting: String, value: T) extends TypedSetting {
  val settings = Seq(setting, value.toString)
}
