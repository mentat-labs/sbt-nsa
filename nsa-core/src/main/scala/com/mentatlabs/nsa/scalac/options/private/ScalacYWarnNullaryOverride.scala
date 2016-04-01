package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-nullary-override
  * =======================
  *    2.9.1 - 2.11.1: Warn when non-nullary overrides nullary, e.g. `def foo()` over `def foo`.
  *   2.11.2 - 2.12.0: Warn when non-nullary `def f()' overrides nullary `def f'.
  */
case object ScalacYWarnNullaryOverride
    extends ScalacOptionBoolean("-Ywarn-nullary-override", ScalacVersions.`2.9.1`)
