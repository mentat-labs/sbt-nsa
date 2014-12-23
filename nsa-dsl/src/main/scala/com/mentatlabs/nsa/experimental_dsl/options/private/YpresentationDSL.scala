package com.mentatlabs.nsa
package experimental_dsl

trait YpresentationDSL extends ExperimentalDSL with VerboseDSL {
  object Ypresentation {
    val unary_- = `-Ypresentation`
    object `-Ypresentation` {
      def -(d: debug.type) = `-Ypresentation-debug`
      def -(s: strict.type) = `-Ypresentation-strict`
      def -(v: verbose.type) = `-Ypresentation-verbose`
    }
  }
}
