package hr.element.sbt.nsa

trait TypedSetting {
  def settings: Seq[String]
//  def since: Option[ScalaVersion]
//  def deprecated: Option[ScalaVersion]
//  def removed: Option[ScalaVersion]
}

abstract class JustSetting extends TypedSetting { self: Product =>
  def settings = Seq(toString)
}

case class ChoiceSetting[T](setting: String, values: T*) extends TypedSetting {
  val settings = Seq(setting + ":" + values.mkString(","))
  override val toString = settings.head
}

case class ValueSetting[T](setting: String, value: T) extends TypedSetting {
  val settings = Seq(setting, value.toString)
  override val toString = settings.mkString(" ")
}
