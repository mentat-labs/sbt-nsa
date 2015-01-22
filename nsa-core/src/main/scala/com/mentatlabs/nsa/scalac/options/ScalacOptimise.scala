package com.mentatlabs.nsa
package scalac
package options

/** -optimise
  * =========
  *    2.6.0 - 2.12.0: Generates faster bytecode by applying optimisations to the program
  */
case object ScalacOptimise
    extends ScalacOptionSwitch("-optimise") {
  val since = `2.6.0`
}
