package com.mentatlabs.nsa
package experimental_dsl

trait YquasiquoteDSL extends ExperimentalDSL {
  object Yquasiquote {
    val unary_- = `-Yquasiquote`
    object `-Yquasiquote` {
      def -(d: debug.type) = `-Yquasiquote-debug`
    }
  }
}
