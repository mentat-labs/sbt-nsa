package com.mentatlabs.nsa

/** Do not use the boot classpath for the scala jars. */
case object `-nobootcp` extends JustOption {
  val since = ScalacVersion.`2.9.0`
}
