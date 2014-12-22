package com.mentatlabs.nsa

/** Strategy used for translating lambdas into JVM code. */
object `-Ydelambdafy` {
  private val since = ScalacVersion.`2.11.0`

  case class custom(strategy: String)
      extends ChoiceOption("-Ydelambdafy", strategy) {
    val since = `-Ydelambdafy`.since
  }

  def inline = custom("inline")
  def method = custom("method")
}
