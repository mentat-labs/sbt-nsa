package com.mentatlabs.nsa
package scalac
package options

/** -Ydisable-unreachable-prevention
  * ================================
  *   2.11.0 - 2.12.0: Disable the prevention of unreachable blocks in code generation.
  */
case object ScalacYDisableUnreachablePrevention
    extends ScalacOptionSwitch("-Ydisable-unreachable-prevention") {
  val since = ScalacVersions.`2.11.0`
}
