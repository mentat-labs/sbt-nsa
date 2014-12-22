package com.mentatlabs.nsa

/** Compiler stays resident: read source filenames from standard input. */
case object `-Xresident` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
