package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-unused
  * =============
  *   2.11.0 - 2.11.2: Warn when local and private vals, vars, defs, and types are are unused
  *   2.11.3 - 2.12.0: Warn when local and private vals, vars, defs, and types are are unused.
  */
case object ScalacYWarnUnused
    extends ScalacOptionBoolean("-Ywarn-unused", ScalacVersions.`2.11.0`)
