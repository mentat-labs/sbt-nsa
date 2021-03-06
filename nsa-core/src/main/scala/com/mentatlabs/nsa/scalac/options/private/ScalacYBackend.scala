package com.mentatlabs.nsa
package scalac
package options

/* -Ybackend:<choice of bytecode emitter>
 * ======================================
 *   2.11.0 - 2.11.8: Choice of bytecode emitter. (GenASM,GenBCode) default:GenASM
 *            2.12.0: !! missing !!
 */
object ScalacYBackend
    extends ScalacOptionChoiceContainer[String]("-Ybackend", ScalacVersions.`2.11.0`) {

  def GenASM = apply("GenASM")
  def GenBCode = apply("GenBCode")
}
