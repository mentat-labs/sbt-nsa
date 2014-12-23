package com.mentatlabs.nsa
package experimental_dsl

trait YreifyDSL extends ExperimentalDSL {
  object Yreify {
    val unary_- = `-Yreify`
    object `-Yreify` {
      def -(c: copypaste.type) = `-Yreify-copypaste`
      def -(d: debug.type) = `-Yreify-debug`
    }
  }
}
