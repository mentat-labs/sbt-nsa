package com.mentatlabs.nsa
package scalac
package options

/** -Xlog-reflective-calls
  * ======================
  *   2.10.0 - 2.12.0: Print a message when a reflective method call is generated
  */
case object ScalacXLogReflectiveCalls
    extends ScalacOptionSwitch("-Xlog-reflective-calls") {
  val since = `2.10.0`
}
