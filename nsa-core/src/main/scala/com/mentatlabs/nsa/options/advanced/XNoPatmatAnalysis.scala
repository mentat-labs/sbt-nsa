package com.mentatlabs.nsa

/** Don't perform exhaustivity/unreachability analysis. Also, ignore @switch annotation. */
case object `-Xno-patmat-analysis` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
