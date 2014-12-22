package com.mentatlabs.nsa

/** Choice of bytecode emitter. */
object `-Ybackend` {
  private val since = ScalacVersion.`2.11.0`

  case class custom(emitter: String)
      extends ChoiceOption("-Ybackend", emitter) {
    val since = `-Ybackend`.since
  }

  def GenASM = custom("GenASM")
  def GenBCode = custom("GenBCode")
}
