package com.mentatlabs.nsa
package experimental_dsl

trait XdisableDSL extends ExperimentalDSL {
  object Xdisable {
    val unary_- = `-Xdisable`
    object `-Xdisable` {
      def -(a: assertions.type) = `-Xdisable-assertions`
    }
  }
}
