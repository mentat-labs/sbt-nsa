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

abstract class ScalacOptionSwitch(val setting: String)
    extends CompilerOptionSwitch
    with ScalacOption

abstract class ScalacOptionValue[T](val setting: String, val value: T)
    extends CompilerOptionValue[T]
    with ScalacOption

abstract class ScalacOptionChoice(val setting: String, val values: String*)
    extends CompilerOptionChoice
    with ScalacOption
