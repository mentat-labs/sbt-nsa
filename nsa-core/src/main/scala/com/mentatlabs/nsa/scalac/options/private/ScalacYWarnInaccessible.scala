package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-inaccessible
  * ===================
  *    2.9.1 - 2.12.0: Warn about inaccessible types in method signatures.
  */
case object ScalacYWarnInaccessible
    extends ScalacOptionSwitch("-Ywarn-inaccessible") {
  val since = ScalacVersions.`2.9.1`
}
