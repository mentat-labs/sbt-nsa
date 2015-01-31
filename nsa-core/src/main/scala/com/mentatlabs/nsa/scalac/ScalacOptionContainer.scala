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
