package com.mentatlabs.nsa

/** Warn when non-nullary `def f()' overrides nullary `def f'. */
case object `-Ywarn-nullary-override` extends JustOption {
  val since = ScalacVersion.`2.9.1`
}
