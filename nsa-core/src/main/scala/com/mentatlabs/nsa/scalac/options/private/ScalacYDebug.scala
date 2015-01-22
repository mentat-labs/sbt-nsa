package com.mentatlabs.nsa
package scalac
package options

/** -Ydebug
  * =======
  *     2.6.0 - 2.8.2: Output debugging messages
  *    2.9.0 - 2.12.0: Increase the quantity of debugging output.
  */
case object ScalacYDebug
    extends ScalacOptionSwitch("-Ydebug") {
  val since = `2.6.0`
}
