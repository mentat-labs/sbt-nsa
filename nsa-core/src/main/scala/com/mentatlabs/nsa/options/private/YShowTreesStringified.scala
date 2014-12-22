package com.mentatlabs.nsa

/** (Requires -Xprint:) Print stringifications along with detailed ASTs. */
case object `-Yshow-trees-stringified` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
