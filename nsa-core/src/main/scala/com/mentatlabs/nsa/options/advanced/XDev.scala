package com.mentatlabs.nsa

/** Indicates user is a developer - issue warnings about anything which seems amiss */
case object `-Xdev` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
