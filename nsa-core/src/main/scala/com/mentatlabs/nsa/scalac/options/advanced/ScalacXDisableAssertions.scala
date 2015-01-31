package com.mentatlabs.nsa
package scalac
package options

/** -Xdisable-assertions
  * ====================
  *     2.6.0 - 2.8.2: Generate no assertions and assumptions
  *    2.9.0 - 2.12.0: Generate no assertions or assumptions.
  */
case object ScalacXDisableAssertions
    extends ScalacOptionSwitch("-Xdisable-assertions") {
  val since = ScalacVersions.`2.6.0`
}
