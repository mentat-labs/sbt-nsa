package com.mentatlabs.nsa
package scalac
package options

/** -Ybreak-cycles
  * ==============
  *   2.11.0 - 2.12.0: Attempt to break cycles encountered during typing
  */
case object ScalacYBreakCycles
    extends ScalacOptionSwitch("-Ybreak-cycles") {
  val since = `2.11.0`
}
