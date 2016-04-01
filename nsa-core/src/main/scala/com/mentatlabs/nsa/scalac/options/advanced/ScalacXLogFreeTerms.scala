package com.mentatlabs.nsa
package scalac
package options

/** -Xlog-free-terms
  * ================
  *   2.10.0 - 2.12.0: Print a message when reification creates a free term.
  */
case object ScalacXLogFreeTerms
    extends ScalacOptionBoolean("-Xlog-free-terms", ScalacVersions.`2.10.0`)
