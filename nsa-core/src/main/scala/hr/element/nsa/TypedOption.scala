package hr.element.nsa

trait TypedOption extends ScalacVersionRange {
  def options: Seq[String]
}

abstract class JustOption extends TypedOption { self: Product =>
  def options = Seq(toString)
}

case class ChoiceOption[T](setting: String, values: T*) extends TypedOption {
  val options = Seq(setting + ":" + values.mkString(","))
  override val toString = options.head
}

case class ValueOption[T](setting: String, value: T) extends TypedOption {
  val options = Seq(setting, value.toString)
  override val toString = options.mkString(" ")
}
