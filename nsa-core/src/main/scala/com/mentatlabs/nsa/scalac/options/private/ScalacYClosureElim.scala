package com.mentatlabs.nsa
package scalac
package options

/** -Yclosure-elim
  * ==============
  *     2.6.0 - 2.8.2: Perform closure elimination
  *    2.9.0 - 2.12.0: Perform closure elimination.
  */
case object ScalacYClosureElim
    extends ScalacOptionSwitch("-Yclosure-elim") {
  val since = `2.6.0`
}
