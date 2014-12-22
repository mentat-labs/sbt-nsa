package com.mentatlabs.nsa

/** Print stack traces when a context issues an error. */
case object `-Yissue-debug` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
