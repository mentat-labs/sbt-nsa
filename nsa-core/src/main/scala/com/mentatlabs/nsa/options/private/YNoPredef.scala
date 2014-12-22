package com.mentatlabs.nsa

/** Compile without importing Predef. */
case object `-Yno-predef` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
