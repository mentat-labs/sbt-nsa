package com.mentatlabs.nsa
package scalac
package options

/* -Yinline-handlers
 * =================
 *   2.10.0 - 2.11.8: Perform exception handler inlining when possible.
 *            2.12.0: !! missing !!
 */
case object ScalacYInlineHandlers
    extends ScalacOptionBoolean("-Yinline-handlers", ScalacVersions.`2.10.0`)
