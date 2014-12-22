package com.mentatlabs.nsa

/** Wrap field accessors to throw an exception on uninitialized access. */
case object `-Xcheckinit` extends JustOption {
  val since = ScalacVersion.`2.7.2`
}
