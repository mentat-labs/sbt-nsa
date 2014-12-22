package com.mentatlabs.nsa

/** Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver. */
case object `-Yno-adapted-args` extends JustOption {
  val since = ScalacVersion.`2.10.0`
}
