package com.mentatlabs.nsa
package scalac
package options

/** -Yconst-opt
  * ===========
  *   2.11.0 - 2.12.0: Perform optimization with constant values.
  */
case object ScalacYConstOpt
    extends ScalacOptionSwitch("-Yconst-opt") {
  val since = ScalacVersions.`2.11.0`
}
