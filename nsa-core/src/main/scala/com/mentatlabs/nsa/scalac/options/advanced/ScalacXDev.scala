package com.mentatlabs.nsa
package scalac
package options

/** -Xdev
  * =====
  *   2.11.0 - 2.12.0: Indicates user is a developer - issue warnings about anything which seems amiss
  */
case object ScalacXDev
    extends ScalacOptionSwitch("-Xdev") {
  val since = ScalacVersions.`2.11.0`
}
