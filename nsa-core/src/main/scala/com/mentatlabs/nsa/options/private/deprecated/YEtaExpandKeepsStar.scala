package com.mentatlabs.nsa

/** Eta-expand varargs methods to T* rather than Seq[T].  This is a temporary option to ease transition. */
case object `-Yeta-expand-keeps-star` extends JustOption {
  val since = ScalacVersion.`2.10.0`
  override val deprecated = Some(ScalacVersion.`2.11.0`)
  override val removed = Some(ScalacVersion.`2.12.0`)
}
