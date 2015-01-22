package com.mentatlabs.nsa
package scalac
package options

/** -Xprompt
  * ========
  *     2.6.0 - 2.8.2: Display a prompt after each error (debugging option)
  *    2.9.0 - 2.12.0: Display a prompt after each error (debugging option).
  */
case object ScalacXPrompt
    extends ScalacOptionSwitch("-Xprompt") {
  val since = `2.6.0`
}
