package com.mentatlabs.nsa
package scalac

trait ScalacOptionContainer[T]
    extends CompilerOptionContainer[T] {
  type CompilerOptionType = ScalacOption
}

class ScalacOptionValueContainer[T](
    val setting: String
  , val since: ScalacVersion
  ) extends ScalacOptionContainer[T] { self =>

  def apply(value: T) = custom(value)

  def custom[U](value: U) =
    new ScalacOptionValue(setting, value) {
      override def since = self.since
    }
}

class ScalacOptionChoiceContainer[T](
    val setting: String
  , val since: ScalacVersion
  ) extends ScalacOptionContainer[T] { self =>

  def apply(value: T) = custom(value)

  def custom[U](value: U) =
    new ScalacOptionChoice(setting, value) {
      override def since = self.since
    }
}

class ScalacOptionBoolean(
    override val setting: String
  , override val since: ScalacVersion
  ) extends ScalacOptionChoiceContainer[Boolean](setting, since)
  with ScalacOptionEmptyChoice {

  def `true` = apply(true)
  def `false` = apply(false)
}
