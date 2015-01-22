package com.mentatlabs.nsa
package scalac
package options

/** -Ydead-code
  * ===========
  *     2.6.0 - 2.8.2: Perform dead code elimination
  *    2.9.0 - 2.12.0: Perform dead code elimination.
  */
case object ScalacYDeadCode
    extends ScalacOptionSwitch("-Ydead-code") {
  val since = `2.6.0`
}
