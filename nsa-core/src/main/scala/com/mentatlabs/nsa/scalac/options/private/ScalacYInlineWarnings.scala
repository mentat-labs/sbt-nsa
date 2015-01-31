package com.mentatlabs.nsa
package scalac
package options

/** -Yinline-warnings
  * =================
  *   2.10.0 - 2.12.0: Emit inlining warnings. (Normally surpressed due to high volume)
  */
case object ScalacYInlineWarnings
    extends ScalacOptionSwitch("-Yinline-warnings") {
  val since = ScalacVersions.`2.10.0`
}
