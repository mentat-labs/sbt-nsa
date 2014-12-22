package com.mentatlabs.nsa

/** Compile without importing scala.*, java.lang.*, or Predef. */
case object `-Yno-imports` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
