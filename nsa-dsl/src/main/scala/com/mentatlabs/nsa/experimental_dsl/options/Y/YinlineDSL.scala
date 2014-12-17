package com.mentatlabs.nsa
package experimental_dsl

trait YinlineDSL extends ExperimentalDSL {
  object Yinline {
    val unary_- = `-Yinline`
  }

  implicit class PimpYinline(y: `-Yinline`.type) {
    def -(h: handlers.type) = `-Yinline-handlers`
    def -(w: warnings.type) = `-Yinline-warnings`
  }
}
