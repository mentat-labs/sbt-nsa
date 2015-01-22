package com.mentatlabs.nsa
package scalac

trait ScalacOptionContainer[T]
    extends CompilerOptionContainer[T] {
  type CompilerOptionType = ScalacOption
}

class ScalacOptionValueContainer[T](
    protected val setting: String
  , protected val since: ScalacVersion
  ) extends ScalacOptionContainer[T] { self =>

  def apply(value: T) =
    new ScalacOptionValue(setting, value) {
      override def since = self.since
    }
}

class ScalacOptionChoiceContainer(
    protected val setting: String
  , protected val since: ScalacVersion
  ) extends ScalacOptionContainer[String] { self =>

  def apply(value: String) =
    new ScalacOptionChoice(setting, value) {
      override def since = self.since
    }
}
