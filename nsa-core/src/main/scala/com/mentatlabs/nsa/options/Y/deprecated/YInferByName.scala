package com.mentatlabs.nsa

case object `-Yinfer-by-name` extends JustOption {
  override val since = ScalacVersion.`2.11.0`
  override val deprecated = Some(ScalacVersion.`2.11.0`)
  override val removed = Some(ScalacVersion.`2.12.0`)
}
