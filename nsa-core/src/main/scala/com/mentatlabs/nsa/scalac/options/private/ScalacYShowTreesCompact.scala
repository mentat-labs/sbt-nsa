package com.mentatlabs.nsa
package scalac
package options

/** -Yshow-trees-compact
  * ====================
  *   2.10.0 - 2.12.0: (Requires -Xprint:) Print detailed ASTs in compact form.
  */
case object ScalacYShowTreesCompact
    extends ScalacOptionBoolean("-Yshow-trees-compact", ScalacVersions.`2.10.0`)
