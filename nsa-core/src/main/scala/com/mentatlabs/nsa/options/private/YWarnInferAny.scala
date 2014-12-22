package com.mentatlabs.nsa

/** Warn when a type argument is inferred to be `Any`. */
case object `-Ywarn-infer-any` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
