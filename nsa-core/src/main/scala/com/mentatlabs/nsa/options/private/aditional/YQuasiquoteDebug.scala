package com.mentatlabs.nsa

/** Trace quasiquote-related activities. */
case object `-Yquasiquote-debug` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
