package com.mentatlabs.nsa
package scalac
package options

/** -Ynooptimise
  * ============
  *   2.11.0 - 2.12.0: Clears all the flags set by -optimise. Useful for testing optimizations in isolation.
  */
case object ScalacYNooptimise
    extends ScalacOptionSwitch("-Ynooptimise") {
  val since = ScalacVersions.`2.11.0`
}
