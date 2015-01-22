package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-unused-import
  * ====================
  *   2.11.0 - 2.11.2: Warn when imports are unused
  *   2.11.3 - 2.12.0: Warn when imports are unused.
  */
case object ScalacYWarnUnusedImport
    extends ScalacOptionSwitch("-Ywarn-unused-import") {
  val since = `2.11.0`
}
