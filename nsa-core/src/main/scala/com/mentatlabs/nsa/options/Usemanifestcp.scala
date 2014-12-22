package com.mentatlabs.nsa

/** Utilize the manifest in classpath resolution. */
case object `-usemanifestcp` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
