package com.mentatlabs.nsa

/** Clears all the flags set by -optimise. Useful for testing optimizations in isolation. */
case object `-Ynooptimise` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
