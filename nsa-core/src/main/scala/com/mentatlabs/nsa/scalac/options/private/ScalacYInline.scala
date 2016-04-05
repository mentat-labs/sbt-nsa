package com.mentatlabs.nsa
package scalac
package options

/* -Yinline
 * ========
 *     2.0.0 - 2.5.1: Perform inlining when possible // previously -Xinline
 *     2.6.0 - 2.8.2: Perform inlining when possible
 *    2.9.0 - 2.11.8: Perform inlining when possible.
 *            2.12.0: !! missing !!
 */
case object ScalacYInline
    extends ScalacOptionBoolean("-Yinline", ScalacVersions.`2.6.0`)
