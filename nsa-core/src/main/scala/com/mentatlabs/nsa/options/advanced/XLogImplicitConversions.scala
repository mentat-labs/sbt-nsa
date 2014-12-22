package com.mentatlabs.nsa

/** Print a message whenever an implicit conversion is inserted. */
case object `-Xlog-implicit-conversions` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
