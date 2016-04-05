package com.mentatlabs.nsa
package scalac
package options

/* -Ynooptimise
 * ============
 *   2.11.0 - 2.11.8: Clears all the flags set by -optimise. Useful for testing optimizations in isolation.
 *            2.12.0: !! missing !!
 */
case object ScalacYNooptimise
    extends ScalacOptionBoolean("-Ynooptimise", ScalacVersions.`2.11.0`)
