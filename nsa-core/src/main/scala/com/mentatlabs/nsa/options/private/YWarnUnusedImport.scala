package com.mentatlabs.nsa

/** Warn when imports are unused. */
case object `-Ywarn-unused-import` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
