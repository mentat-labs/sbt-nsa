package com.mentatlabs.nsa

/** Enable experimental extensions. */
case object `-Xexperimental` extends JustOption {
  val since = ScalacVersion.`2.2.0`
}
