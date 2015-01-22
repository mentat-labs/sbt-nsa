package com.mentatlabs.nsa
package scalac
package options

/** -Yinline-handlers
  * =================
  *   2.10.0 - 2.12.0: Perform exception handler inlining when possible.
  */
case object ScalacYInlineHandlers
    extends ScalacOptionSwitch("-Yinline-handlers") {
  val since = `2.10.0`
}
