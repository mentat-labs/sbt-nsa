package com.mentatlabs.nsa

/** Trace all macro-related activities: compilation, generation of synthetics, classloading, expansion, exceptions. */
case object `-Ymacro-debug-verbose` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
