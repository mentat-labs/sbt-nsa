package com.mentatlabs.nsa
package scalac
package options

/** -Ypatmat-debug
  * ==============
  *   2.10.0 - 2.12.0: Trace pattern matching translation.
  */
case object ScalacYPatmatDebug
    extends ScalacOptionSwitch("-Ypatmat-debug") {
  val since = `2.10.0`
}
