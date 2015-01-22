package com.mentatlabs.nsa
package scalac
package options

/** -Yno-predefs
  * ============
  *     2.6.0 - 2.8.2: Compile without any implicit predefined values
  */
// legacy, unsupported

/** -Yno-predef
  * ===========
  *   2.10.0 - 2.12.0: Compile without importing Predef.
  */
case object ScalacYNoPredef
    extends ScalacOptionSwitch("-Yno-predef") {
  val since = `2.10.0`
}
