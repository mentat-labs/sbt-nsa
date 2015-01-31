package com.mentatlabs.nsa
package scalac

sealed trait ScalacOption
    extends CompilerOption {

  def since: ScalacVersion
  def deprecated: Option[ScalacVersion] = None
  def removed: Option[ScalacVersion] = None

  def isDefinedAt(scalaVersion: ScalacVersion) =
    since <= scalaVersion && removed.forall { scalaVersion < }
}

trait ScalacOptionSwitchLike
    extends CompilerOptionSwitch
    with ScalacOption

abstract class ScalacOptionSwitch(val setting: String)
    extends ScalacOptionSwitchLike


trait ScalacOptionValueLike[T]
    extends CompilerOptionValue[T]
    with ScalacOption

abstract class ScalacOptionValue[T](val setting: String, val value: T)
    extends ScalacOptionValueLike[T]


trait ScalacOptionChoiceLike[T]
    extends CompilerOptionChoice[T]
    with ScalacOption

abstract class ScalacOptionChoice[T](val setting: String, val values: T*)
    extends ScalacOptionChoiceLike[T]

trait ScalacOptionEmptyChoice
    extends CompilerOptionChoice[Nothing]
    with ScalacOption {
  val values = Nil
}
