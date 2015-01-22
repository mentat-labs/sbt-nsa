package com.mentatlabs.nsa
package scalac
package options

/** -Ybackend:<choice of bytecode emitter>
  * ======================================
  *   2.11.0 - 2.12.0: Choice of bytecode emitter. (GenASM,GenBCode) default:GenASM
  */
object ScalacYBackend
    extends ScalacOptionChoiceContainer("-Ybackend", `2.11.0`) {

  def GenASM = apply("GenASM")
  def GenBCode = apply("GenBCode")
}
