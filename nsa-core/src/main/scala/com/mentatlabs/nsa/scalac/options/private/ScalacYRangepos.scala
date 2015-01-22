package com.mentatlabs.nsa
package scalac
package options

/** -Yrangepos
  * ==========
  *    2.8.0 - 2.12.0: Use range positions for syntax trees.
  */
case object ScalacYRangepos
    extends ScalacOptionSwitch("-Yrangepos") {
  val since = `2.8.0`
}
