package com.mentatlabs.nsa
package experimental_dsl

trait YposDSL extends ExperimentalDSL {
  object Ypos {
    val unary_- = `-Ypos`
    object `-Ypos` {
      def -(d: debug.type) = `-Ypos-debug`
    }
  }
}
