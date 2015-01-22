package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-value-discard
  * ====================
  *    2.9.1 - 2.12.0: Warn when non-Unit expression results are unused.
  */
case object ScalacYWarnValueDiscard
    extends ScalacOptionSwitch("-Ywarn-value-discard") {
  val since = `2.9.1`
}
