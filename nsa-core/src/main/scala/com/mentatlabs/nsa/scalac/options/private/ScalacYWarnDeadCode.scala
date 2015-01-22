package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-dead-code
  * ================
  *   2.6.0 - 2.9.0-1: Emit warnings for dead code
  *    2.9.1 - 2.12.0: Warn when dead code is identified.
  */
case object ScalacYWarnDeadCode
    extends ScalacOptionSwitch("-Ywarn-dead-code") {
  val since = `2.6.0`
}
