package com.mentatlabs.nsa
package scalac
package options

/* -Xfull-lubs
 * ===========
 *   2.10.0 - 2.12.0: Retains pre 2.10 behavior of less aggressive truncation of least upper bounds.
 */
case object ScalacXFullLubs
    extends ScalacOptionBoolean("-Xfull-lubs", ScalacVersions.`2.10.0`)
