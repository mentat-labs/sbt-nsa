package com.mentatlabs.nsa
package scalac
package options

/** -verbose
  * ========
  *     2.0.0 - 2.8.2: Output messages about what the compiler is doing
  *    2.9.0 - 2.12.0: Output messages about what the compiler is doing.
  */
case object ScalacVerbose
    extends ScalacOptionSwitch("-verbose") {
  val since = ScalacVersions.`2.0.0`
}
