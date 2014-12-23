package com.mentatlabs.nsa
package experimental_dsl

trait YnoDSL extends ExperimentalDSL {
  object Yno {
    val unary_- = `-Yno`
    object `-Yno` {
      def -(a: adapted.type) = `-Yno-adapted`
      object `-Yno-adapted` {
        def -(a: args.type) = `-Yno-adapted-args`
      }

      def -(c: completion.type) = `-Yno-completion`

      def -(g: generic.type) = `-Yno-generic`
      object `-Yno-generic` {
        def -(s: signatures.type) = `-Yno-generic-signatures`
      }

      def -(i: imports.type) = `-Yno-imports`

      def -(l: load.type) = `-Yno-load`
      object `-Yno-load` {
        def -(i: impl.type) = `-Yno-load-impl`
        object `-Yno-load-impl` {
          def -(c: `class`.type) = `-Yno-load-impl-class`
        }

        // helper method instead of -Yno-load-impl-`class`
        def -(ic: impl_class.type) = `-Yno-load-impl-class`
      }

      def -(p: predef.type) = `-Yno-predef`
    }
  }
}
