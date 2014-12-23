package com.mentatlabs.nsa
package experimental_dsl

trait YcompactDSL extends ExperimentalDSL {
  object Ycompact {
    val unary_- = `-Ycompact`
    object `-Ycompact` {
      def -(t: trees.type) = `-Ycompact-trees`
    }
  }
}
