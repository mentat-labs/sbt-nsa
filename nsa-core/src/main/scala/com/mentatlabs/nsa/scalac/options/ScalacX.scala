package com.mentatlabs.nsa
package scalac
package options

/** -X
  * ==
  *     2.6.0 - 2.8.2: Print a synopsis of advanced options
  *    2.9.0 - 2.12.0: Print a synopsis of advanced options.
  */
case object ScalacX
    extends ScalacOptionSwitch("-X") {
  val since = ScalacVersions.`2.6.0`
}
