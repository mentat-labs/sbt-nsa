package com.mentatlabs.nsa
package scalac
package options

/** -Yreify-debug
  * =============
  *   2.10.0 - 2.12.0: Trace reification.
  */
case object ScalacYReifyDebug
    extends ScalacOptionBoolean("-Yreify-debug", ScalacVersions.`2.10.0`)
