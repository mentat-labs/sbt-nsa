package com.mentatlabs.nsa
package experimental_dsl

trait YideDSL extends ExperimentalDSL {
  object Yide {
    val unary_- = `-Yide`
    object `-Yide` {
      def -(d: debug.type) = `-Yide-debug`
    }
  }
}
