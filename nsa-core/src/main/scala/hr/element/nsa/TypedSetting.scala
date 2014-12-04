package hr.element.nsa

trait ScalaVersionLifecycle {
  def since: SinceScalaVersion = `2.0.0`
  def removed: Option[SinceScalaVersion] = None

  def isDefinedAt(scalaVersion: SinceScalaVersion) =
    since <= scalaVersion && removed.forall { _ > scalaVersion }
}

trait TypedSetting extends ScalaVersionLifecycle {
  def settings: Seq[String]
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
