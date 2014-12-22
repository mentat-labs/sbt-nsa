package com.mentatlabs.nsa

trait TypedOption extends ScalacVersionRange {
  def params: Seq[String]
}

abstract class JustOption extends TypedOption { self: Product =>
  def params = Seq(toString)
}

abstract class ChoiceOption[T](setting: String, values: T*) extends TypedOption {
  val params = Seq(setting + ":" + values.mkString(","))
  override val toString = params.head
}

abstract class ValueOption[T](setting: String, value: T) extends TypedOption {
  val params = Seq(setting, value.toString)
  override val toString = params.mkString(" ")
}
