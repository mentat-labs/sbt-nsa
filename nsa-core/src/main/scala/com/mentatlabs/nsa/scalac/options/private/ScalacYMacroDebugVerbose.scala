package com.mentatlabs.nsa
package scalac
package options

/** -Ymacro-debug-verbose
  * =====================
  *   2.10.0 - 2.12.0: Trace all macro-related activities: compilation, generation of synthetics, classloading, expansion, exceptions.
  */
case object ScalacYMacroDebugVerbose
    extends ScalacOptionSwitch("-Ymacro-debug-verbose") {
  val since = `2.10.0`
}
