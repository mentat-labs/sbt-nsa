package com.mentatlabs.nsa
package scalac
package options

/* -Ywarn-value-discard
 * ====================
 *    2.9.1 - 2.12.0: Warn when non-Unit expression results are unused.
 */
case object ScalacYWarnValueDiscard
    extends ScalacOptionBoolean("-Ywarn-value-discard", ScalacVersions.`2.9.1`)
