package com.mentatlabs.nsa

/** Perform exception handler inlining when possible. */
case object `-Yinline-handlers` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
