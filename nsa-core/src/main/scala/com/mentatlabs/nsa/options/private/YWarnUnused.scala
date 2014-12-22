package com.mentatlabs.nsa

/** Warn when local and private vals, vars, defs, and types are are unused. */
case object `-Ywarn-unused` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
