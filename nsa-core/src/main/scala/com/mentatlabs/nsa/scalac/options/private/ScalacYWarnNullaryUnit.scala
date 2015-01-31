package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-nullary-unit
  * ===================
  *    2.9.1 - 2.12.0: Warn when nullary methods return Unit.
  */
case object ScalacYWarnNullaryUnit
    extends ScalacOptionSwitch("-Ywarn-nullary-unit") {
  val since = ScalacVersions.`2.9.1`
}
