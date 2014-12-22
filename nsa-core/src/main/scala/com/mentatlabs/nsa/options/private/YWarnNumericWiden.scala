package com.mentatlabs.nsa

/** Warn when numerics are widened. */
case object `-Ywarn-numeric-widen` extends JustOption {
  val since = ScalacVersion.`2.9.1`
}
