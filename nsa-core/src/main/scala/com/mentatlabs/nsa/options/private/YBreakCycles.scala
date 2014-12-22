package com.mentatlabs.nsa

/** Attempt to break cycles encountered during typing */
case object `-Ybreak-cycles` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
