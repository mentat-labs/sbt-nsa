package com.mentatlabs.nsa
package scalac
package options

/** -Xlog-free-terms
  * ================
  *   2.10.0 - 2.12.0: Print a message when reification creates a free term.
  */
case object ScalacXLogFreeTerms
    extends ScalacOptionSwitch("-Xlog-free-terms") {
  val since = `2.10.0`
}
