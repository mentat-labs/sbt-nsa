package com.mentatlabs.nsa
package scalac
package options

/** -Ydoc-debug
  * ===========
  *    2.9.0 - 2.12.0: Trace all scaladoc activity.
  */
case object ScalacYDocDebug
    extends ScalacOptionSwitch("-Ydoc-debug") {
  val since = ScalacVersions.`2.9.0`
}
