package com.mentatlabs.nsa

/** Emit warning and location for usages of deprecated APIs. */
case object `-deprecation` extends JustOption {
  val since = ScalacVersion.`2.3.0`
}
