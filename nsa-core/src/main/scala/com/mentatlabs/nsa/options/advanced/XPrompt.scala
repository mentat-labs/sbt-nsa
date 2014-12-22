package com.mentatlabs.nsa

/** Display a prompt after each error (debugging option). */
case object `-Xprompt` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
