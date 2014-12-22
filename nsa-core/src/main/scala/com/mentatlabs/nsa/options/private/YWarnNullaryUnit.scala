package com.mentatlabs.nsa

/** Warn when nullary methods return Unit. */
case object `-Ywarn-nullary-unit` extends JustOption {
  val since = ScalacVersion.`2.9.1`
}
