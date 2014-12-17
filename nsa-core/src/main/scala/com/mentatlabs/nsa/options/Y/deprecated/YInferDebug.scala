package com.mentatlabs.nsa

case object `-Yinfer-debug` extends JustOption {
  override val since = ScalacVersion.`2.9.1`
  override val deprecated = Some(ScalacVersion.`2.11.0`)
}
