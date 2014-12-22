package com.mentatlabs.nsa

/** Disable handling of \\u unicode escapes. */
case object `-Xno-uescape` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
