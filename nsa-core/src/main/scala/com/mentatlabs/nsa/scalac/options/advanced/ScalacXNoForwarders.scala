package com.mentatlabs.nsa
package scalac
package options

/** -Xno-forwarders
  * ===============
  *     2.8.0 - 2.8.2: Do not generate static forwarders in mirror classes
  *    2.9.0 - 2.12.0: Do not generate static forwarders in mirror classes.
  */
case object ScalacXNoForwarders
    extends ScalacOptionSwitch("-Xno-forwarders") {
  val since = ScalacVersions.`2.8.0`
}
