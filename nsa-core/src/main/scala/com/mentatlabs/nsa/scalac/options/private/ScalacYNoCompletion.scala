package com.mentatlabs.nsa
package scalac
package options

/** -Yno-completion
  * ===============
  *     2.8.0 - 2.8.2: Disable tab-completion in the REPL
  *    2.9.0 - 2.12.0: Disable tab-completion in the REPL.
  */
case object ScalacYNoCompletion
    extends ScalacOptionSwitch("-Yno-completion") {
  val since = ScalacVersions.`2.8.0`
}
