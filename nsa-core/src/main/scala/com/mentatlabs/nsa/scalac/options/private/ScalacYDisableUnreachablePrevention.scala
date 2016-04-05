package com.mentatlabs.nsa
package scalac
package options

/* -Ydisable-unreachable-prevention
 * ================================
 *   2.11.0 - 2.11.8: Disable the prevention of unreachable blocks in code generation.
 *            2.12.0: !! missing !!
 */
case object ScalacYDisableUnreachablePrevention
    extends ScalacOptionBoolean("-Ydisable-unreachable-prevention", ScalacVersions.`2.11.0`)
