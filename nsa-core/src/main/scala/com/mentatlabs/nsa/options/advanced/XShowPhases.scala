package com.mentatlabs.nsa

/** Print a synopsis of compiler phases. */
case object `-Xshow-phases` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
