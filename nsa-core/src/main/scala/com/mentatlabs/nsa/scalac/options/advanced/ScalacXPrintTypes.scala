package com.mentatlabs.nsa
package scalac
package options

/** -Xprint-types
  * =============
  *     2.6.0 - 2.8.2: Print tree types (debugging option)
  *    2.9.0 - 2.12.0: Print tree types (debugging option).
  */
case object ScalacXPrintTypes
    extends ScalacOptionSwitch("-Xprint-types") {
  val since = ScalacVersions.`2.6.0`
}
