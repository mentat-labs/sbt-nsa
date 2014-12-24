package com.mentatlabs.nsa
package experimental_dsl

trait YstopDSL extends ExperimentalDSL {
  object Ystop {
    val unary_- = `-Ystop`

    object `-Ystop` {
      def -(b: before.type) = `-Ystop-before`
      def -(a: after.type) = `-Ystop-after`
    }
  }
}
