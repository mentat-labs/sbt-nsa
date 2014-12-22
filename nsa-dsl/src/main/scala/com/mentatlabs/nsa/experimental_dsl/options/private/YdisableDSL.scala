package com.mentatlabs.nsa
package experimental_dsl

trait YdisableDSL extends ExperimentalDSL {
  object Ydisable {
    val unary_- = `-Ydisable`
    object `-Ydisable` {
      def -(u: unreachable.type) = `-Ydisable-unreachable`
      object `-Ydisable-unreachable` {
        def -(p: prevention.type) = `-Ydisable-unreachable-prevention`
      }
    }
  }
}
