package com.mentatlabs.nsa

/** Retains pre 2.10 behavior of less aggressive truncation of least upper bounds. */
case object `-Xfull-lubs` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
