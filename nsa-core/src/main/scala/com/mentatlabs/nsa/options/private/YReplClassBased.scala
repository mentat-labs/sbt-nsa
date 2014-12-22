package com.mentatlabs.nsa

/** Use classes to wrap REPL snippets instead of objects */
case object `-Yrepl-class-based` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
