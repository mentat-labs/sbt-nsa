package com.mentatlabs.nsa
package scalac
package options

/* -Yinline-warnings
 * =================
 *   2.10.0 - 2.11.5: Emit inlining warnings. (Normally surpressed due to high volume)
 *   2.11.6 - 2.11.8: Emit inlining warnings. (Normally suppressed due to high volume)
 *            2.12.0: !! missing !!
 */
case object ScalacYInlineWarnings
    extends ScalacOptionBoolean("-Yinline-warnings", ScalacVersions.`2.10.0`)
