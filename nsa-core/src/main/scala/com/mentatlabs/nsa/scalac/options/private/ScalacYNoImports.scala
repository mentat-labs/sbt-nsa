package com.mentatlabs.nsa
package scalac
package options

/** -Yno-imports
  * ============
  *     2.6.0 - 2.8.2: Compile without any implicit imports
  *     2.9.0 - 2.9.3: Compile without any implicit imports.
  *   2.10.0 - 2.12.0: Compile without importing scala.*, java.lang.*, or Predef.
  */
case object ScalacYNoImports
    extends ScalacOptionSwitch("-Yno-imports") {
  val since = ScalacVersions.`2.6.0`
}
