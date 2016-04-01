package com.mentatlabs.nsa
package scalac
package options

/** -Yreify-copypaste
  * =================
  *   2.10.0 - 2.12.0: Dump the reified trees in copypasteable representation.
  */
case object ScalacYReifyCopypaste
    extends ScalacOptionBoolean("-Yreify-copypaste", ScalacVersions.`2.10.0`)
