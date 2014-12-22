package com.mentatlabs.nsa

/** Trace type inference and implicit search. */
case object `-Yinfer-debug` extends JustOption {
  val since = ScalacVersion.`2.9.1`
  override val deprecated = Some(ScalacVersion.`2.11.0`)
}
