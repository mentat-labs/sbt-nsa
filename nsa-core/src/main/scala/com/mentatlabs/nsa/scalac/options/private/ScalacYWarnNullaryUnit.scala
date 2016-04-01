package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-nullary-unit
  * ===================
  *    2.9.1 - 2.12.0: Warn when nullary methods return Unit.
  */
case object ScalacYWarnNullaryUnit
    extends ScalacOptionBoolean("-Ywarn-nullary-unit", ScalacVersions.`2.9.1`)
