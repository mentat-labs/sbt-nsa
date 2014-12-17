package com.mentatlabs.nsa
package experimental_dsl

trait YmacroDSL extends ExperimentalDSL with VerboseDSL {
  object Ymacro {
    val unary_- = `-Ymacro`
    object `-Ymacro` {
      def -(d: debug.type) = `-Ymacro-debug`
      object `-Ymacro-debug` {
        def -(l: lite.type) = `-Ymacro-debug-lite`
        def -(v: verbose.type) = `-Ymacro-debug-verbose`
      }

      def -(n: no.type) = `-Ymacro-no`
      object `-Ymacro-no` {
        def -(e: expand.type) = `-Ymacro-no-expand`
      }
    }
  }
}
