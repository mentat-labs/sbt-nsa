package com.mentatlabs.nsa
package scalac
package options

/* -Ywarn-numeric-widen
 * ====================
 *    2.9.1 - 2.12.0: Warn when numerics are widened.
 */
case object ScalacYWarnNumericWiden
    extends ScalacOptionBoolean("-Ywarn-numeric-widen", ScalacVersions.`2.9.1`)
