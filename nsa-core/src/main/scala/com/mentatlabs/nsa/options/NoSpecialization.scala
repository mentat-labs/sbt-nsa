package com.mentatlabs.nsa

/** Ignore @specialize annotations. */
case object `-no-specialization` extends JustOption {
  val since = ScalacVersion.`2.8.0`
}
