package com.mentatlabs.nsa

/** Print product version and exit. */
case object `-version` extends JustOption {
  val since = ScalacVersion.`2.0.0`
}
