package com.mentatlabs.nsa
package scalac
package options

/* -Ymacro-debug-lite
 * ==================
 *   2.10.0 - 2.12.0: Trace essential macro-related activities.
 */
case object ScalacYMacroDebugLite
    extends ScalacOptionBoolean("-Ymacro-debug-lite", ScalacVersions.`2.10.0`)
