package com.mentatlabs.nsa

/** Emit warning and location for usages of features that should be imported explicitly. */
case object `-feature` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
