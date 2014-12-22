package com.mentatlabs.nsa

/** Do not use asynchronous code for repl startup */
case object `-Yrepl-sync` extends JustOption {
  val since = ScalacVersion.`2.9.1`
}
