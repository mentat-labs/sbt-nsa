package com.mentatlabs.nsa
package experimental_dsl

trait XelideDSL extends ExperimentalDSL {
  object Xelide {
    val unary_- = `-Xelide`
    object `-Xelide` {
      def -(b: below.type) = `-Xelide-below`
    }
  }
}
