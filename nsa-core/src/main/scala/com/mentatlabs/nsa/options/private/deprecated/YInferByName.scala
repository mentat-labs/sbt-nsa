package com.mentatlabs.nsa

/** Allow inference of by-name types. This is a temporary option to ease transition. See SI-7899. */
case object `-Yinfer-by-name` extends JustOption {
  val since = ScalacVersion.`2.11.0`
  override val deprecated = Some(ScalacVersion.`2.11.0`)
  override val removed = Some(ScalacVersion.`2.12.0`)
}
