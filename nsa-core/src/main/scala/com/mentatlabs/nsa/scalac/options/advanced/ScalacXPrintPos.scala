package com.mentatlabs.nsa
package scalac
package options

/** -Xprintpos
  * ==========
  *     2.1.7 - 2.5.1: Print tree positions (as offsets)
  */
// legacy, unsupported

/** -Xprint-pos
  * ===========
  *     2.6.0 - 2.8.2: Print tree positions (as offsets)
  *    2.9.0 - 2.12.0: Print tree positions, as offsets.
  */

/** Print tree positions, as offsets. */
case object ScalacXPrintPos
    extends ScalacOptionSwitch("-Xprint-pos") {
  val since = `2.6.0`
}
