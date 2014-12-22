package com.mentatlabs.nsa

/** (Requires -Xprint:) Print detailed ASTs in formatted form. */
case object `-Yshow-trees` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
