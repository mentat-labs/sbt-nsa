package com.mentatlabs.nsa
package scalac
package options

/** -print:<phase>
  * ==============
  *     2.0.0 - 2.1.0: Print out program after <phases> (see below)
  *     2.1.1 - 2.5.1: Print out program after <phase>
  */
// legacy, unsupported

/** -print
  * ======
  *     2.6.0 - 2.8.2: Print program with all Scala-specific features removed
  *    2.9.0 - 2.12.0: Print program with Scala-specific features removed.
  */
case object ScalacPrint
    extends ScalacOptionSwitch("-print") {
  val since = `2.6.0`
}
