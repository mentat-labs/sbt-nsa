package com.mentatlabs.nsa

/** Generates faster bytecode by applying optimisations to the program */
case object `-optimise` extends JustOption {
  override val since = ScalacVersion.`2.6.0`
}
