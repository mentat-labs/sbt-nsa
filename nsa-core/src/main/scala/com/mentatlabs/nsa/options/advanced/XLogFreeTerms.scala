package com.mentatlabs.nsa

/** Print a message when reification creates a free term. */
case object `-Xlog-free-terms` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
