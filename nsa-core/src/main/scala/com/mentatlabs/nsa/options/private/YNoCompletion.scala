package com.mentatlabs.nsa

/** Disable tab-completion in the REPL. */
case object `-Yno-completion` extends JustOption {
  val since = ScalacVersion.`2.8.0`
}
