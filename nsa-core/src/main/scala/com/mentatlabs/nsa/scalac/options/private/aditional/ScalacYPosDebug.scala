package com.mentatlabs.nsa
package scalac
package options

/* -Ypos-debug
 * ===========
 *   2.10.0 - 2.12.0: Trace position validation.
 */
case object ScalacYPosDebug
    extends ScalacOptionBoolean("-Ypos-debug", ScalacVersions.`2.10.0`)
