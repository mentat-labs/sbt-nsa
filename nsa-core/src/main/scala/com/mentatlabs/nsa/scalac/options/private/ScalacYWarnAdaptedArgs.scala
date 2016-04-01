package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-adapted-args
  * ===================
  *   2.10.0 - 2.12.0: Warn if an argument list is modified to match the receiver.
  */
case object ScalacYWarnAdaptedArgs
    extends ScalacOptionBoolean("-Ywarn-adapted-args", ScalacVersions.`2.10.0`)
