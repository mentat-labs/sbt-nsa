package com.mentatlabs.nsa
package scalac
package options

/** -Xverify
  * ========
  *     2.9.1 - 2.9.3: Verify generic signatures in generated bytecode.
  *   2.10.0 - 2.12.0: Verify generic signatures in generated bytecode (asm backend only.)
  */
case object ScalacXVerify
    extends ScalacOptionSwitch("-Xverify") {
  val since = ScalacVersions.`2.9.1`
}
