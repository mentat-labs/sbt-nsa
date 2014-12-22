package com.mentatlabs.nsa

/** Don't infer known-unsound types */
case object `-Xstrict-inference` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
