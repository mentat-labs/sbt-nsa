package com.mentatlabs.nsa

/** Print owner identifiers next to symbol names. */
case object `-Yshow-symowners` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
