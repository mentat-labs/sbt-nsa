package com.mentatlabs.nsa

/** Fail the compilation if there are any warnings. */
case object `-Xfatal-warnings` extends JustOption {
  val since = ScalacVersion.`2.8.0`
}
