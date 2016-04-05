package com.mentatlabs.nsa
package scalac
package options

/* -Ydead-code
 * ===========
 *     2.1.6 - 2.5.1: Perform dead code elimination // previously -Xdce
 *     2.6.0 - 2.8.2: Perform dead code elimination
 *    2.9.0 - 2.11.8: Perform dead code elimination.
 *            2.12.0: !! missing !!
 */
case object ScalacYDeadCode
    extends ScalacOptionBoolean("-Ydead-code", ScalacVersions.`2.6.0`)
