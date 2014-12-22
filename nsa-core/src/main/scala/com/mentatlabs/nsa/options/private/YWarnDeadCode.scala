package com.mentatlabs.nsa

/** Warn when dead code is identified. */
case object `-Ywarn-dead-code` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
