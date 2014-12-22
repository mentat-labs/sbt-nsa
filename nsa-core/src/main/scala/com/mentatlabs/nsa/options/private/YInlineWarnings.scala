package com.mentatlabs.nsa

/** Emit inlining warnings. (Normally surpressed due to high volume) */
case object `-Yinline-warnings` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
