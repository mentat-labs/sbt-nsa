package com.mentatlabs.nsa
package scalac
package options

/** -Xlog-free-types
  * ================
  *   2.10.0 - 2.12.0: Print a message when reification resorts to generating a free type.
  */
case object ScalacXLogFreeTypes
    extends ScalacOptionSwitch("-Xlog-free-types") {
  val since = ScalacVersions.`2.10.0`
}
