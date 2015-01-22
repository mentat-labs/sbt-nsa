package com.mentatlabs.nsa
package scalac
package options

/** -Yrepl-sync
  * ===========
  *    2.9.1 - 2.12.0: Do not use asynchronous code for repl startup
  */
case object ScalacYReplSync
    extends ScalacOptionSwitch("-Yrepl-sync") {
  val since = `2.9.1`
}
