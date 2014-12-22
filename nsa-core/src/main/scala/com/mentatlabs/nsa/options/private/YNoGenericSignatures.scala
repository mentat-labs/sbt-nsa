package com.mentatlabs.nsa

/** Suppress generation of generic signatures for Java. */
case object `-Yno-generic-signatures` extends JustOption {
  val since = ScalacVersion.`2.7.2`
}
