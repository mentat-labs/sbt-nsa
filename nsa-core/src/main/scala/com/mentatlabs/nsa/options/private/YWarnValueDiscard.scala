package com.mentatlabs.nsa

/** Warn when non-Unit expression results are unused. */
case object `-Ywarn-value-discard` extends JustOption {
  val since = ScalacVersion.`2.9.1`
}
