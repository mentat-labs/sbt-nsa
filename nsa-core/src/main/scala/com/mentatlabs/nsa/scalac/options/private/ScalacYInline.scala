package com.mentatlabs.nsa
package scalac
package options

/** -Yinline
  * ========
  *     2.6.0 - 2.8.2: Perform inlining when possible
  *    2.9.0 - 2.12.0: Perform inlining when possible.
  */
case object ScalacYInline
    extends ScalacOptionBoolean("-Yinline", ScalacVersions.`2.6.0`)
