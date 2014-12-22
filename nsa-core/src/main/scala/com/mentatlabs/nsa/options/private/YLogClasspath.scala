package com.mentatlabs.nsa

/** Output information about what classpath is being applied. */
case object `-Ylog-classpath` extends JustOption {
  val since = ScalacVersion.`2.8.0`
}
