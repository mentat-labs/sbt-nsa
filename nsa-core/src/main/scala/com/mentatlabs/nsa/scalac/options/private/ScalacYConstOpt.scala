package com.mentatlabs.nsa
package scalac
package options

/* -Yconst-opt
 * ===========
 *   2.11.0 - 2.11.8: Perform optimization with constant values.
 *            2.12.0: !! missing !!
 */
case object ScalacYConstOpt
    extends ScalacOptionBoolean("-Yconst-opt", ScalacVersions.`2.11.0`)
