package com.mentatlabs.nsa
package scalac
package options

/** -Yshow-symkinds
  * ===============
  *   2.10.0 - 2.12.0: Print abbreviated symbol kinds next to symbol names.
  */
case object ScalacYShowSymkinds
    extends ScalacOptionSwitch("-Yshow-symkinds") {
  val since = `2.10.0`
}
