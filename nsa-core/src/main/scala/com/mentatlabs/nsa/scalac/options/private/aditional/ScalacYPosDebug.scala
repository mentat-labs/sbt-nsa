package com.mentatlabs.nsa
package scalac
package options

/** -Ypos-debug
  * ===========
  *   2.10.0 - 2.12.0: Trace position validation.
  */
case object ScalacYPosDebug
    extends ScalacOptionSwitch("-Ypos-debug") {
  val since = ScalacVersions.`2.10.0`
}
