package com.mentatlabs.nsa

/** Print the AST symbol hierarchy after each phase. */
case object `-Yshow-syms` extends JustOption {
  val since = ScalacVersion.`2.9.0`
}
