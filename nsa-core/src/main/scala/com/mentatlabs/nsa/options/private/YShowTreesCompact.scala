package com.mentatlabs.nsa

/** (Requires -Xprint:) Print detailed ASTs in compact form. */
case object `-Yshow-trees-compact` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
