package com.mentatlabs.nsa
package scalac
package options

/** -help
  * =====
  *    2.0.0 - 2.12.0: Print a synopsis of standard options
  */
case object ScalacHelp
    extends ScalacOptionSwitch("-help") {
  val since = `2.0.0`
}
