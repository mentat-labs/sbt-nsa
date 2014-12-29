package com.mentatlabs.nsa

/** Specify location(s) of source files. */
object `-sourcepath` {
  private val since = ScalacVersion.`2.0.0`

  case class /(path: String)
      extends ValueOption("-sourcepath", path) {
    val since = `-sourcepath`.since
  }
}
