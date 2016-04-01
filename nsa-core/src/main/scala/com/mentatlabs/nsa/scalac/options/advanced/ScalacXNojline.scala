package com.mentatlabs.nsa
package scalac
package options

/** -Xnojline
  * =========
  *     2.6.0 - 2.8.2: Do not use JLine for editing
  *    2.9.0 - 2.12.0: Do not use JLine for editing.
  */
case object ScalacXNojline
    extends ScalacOptionBoolean("-Xnojline", ScalacVersions.`2.6.0`)
