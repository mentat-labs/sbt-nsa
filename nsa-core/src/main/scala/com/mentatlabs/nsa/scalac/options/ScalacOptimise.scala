package com.mentatlabs.nsa
package scalac
package options

/** -optimise
  * =========
  *    2.6.0 - 2.12.0: Generates faster bytecode by applying optimisations to the program
  */
case object ScalacOptimise
    extends ScalacOptionBoolean("-optimise", ScalacVersions.`2.6.0`)
