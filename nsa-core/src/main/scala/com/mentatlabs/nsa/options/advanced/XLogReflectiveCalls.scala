package com.mentatlabs.nsa

/** Print a message when a reflective method call is generated */
case object `-Xlog-reflective-calls` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
