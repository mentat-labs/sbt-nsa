package com.mentatlabs.nsa
package experimental_dsl

trait YdocDSL extends ExperimentalDSL {
  object Ydoc {
    val unary_- = `-Ydoc`
    object `-Ydoc` {
      def -(d: debug.type) = `-Ydoc-debug`
    }
  }
}
