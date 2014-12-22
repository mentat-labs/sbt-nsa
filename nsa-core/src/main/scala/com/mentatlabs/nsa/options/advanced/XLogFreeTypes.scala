package com.mentatlabs.nsa

/** Print a message when reification resorts to generating a free type. */
case object `-Xlog-free-types` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
