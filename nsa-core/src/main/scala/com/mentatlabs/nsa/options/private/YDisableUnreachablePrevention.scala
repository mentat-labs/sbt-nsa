package com.mentatlabs.nsa

/** Disable the prevention of unreachable blocks in code generation. */
case object `-Ydisable-unreachable-prevention` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
