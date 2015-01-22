package com.mentatlabs.nsa
package scalac
package options

/** -Y
  * ==
  *     2.6.0 - 2.6.1: Print a synopsis of private options
  *     2.8.0 - 2.8.2: Print a synopsis of private options
  *    2.9.0 - 2.12.0: Print a synopsis of private options.
  */
case object ScalacY
    extends ScalacOptionSwitch("-Y") {
  val since = `2.6.0`
}
