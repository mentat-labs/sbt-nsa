package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYNoDSL extends ScalacDSL {
  object Yno {
    val unary_- = `-Yno`
    object `-Yno` {
      def -(a: adapted.type) = `-Yno-adapted`
      object `-Yno-adapted` {
        def -(a: args.type) = ScalacYNoAdaptedArgs
      }

      def -(c: completion.type) = ScalacYNoCompletion

      def -(g: generic.type) = `-Yno-generic`
      object `-Yno-generic` {
        def -(s: signatures.type) = ScalacYNoGenericSignatures
      }

      def -(i: imports.type) = ScalacYNoImports

      def -(l: load.type) = `-Yno-load`
      object `-Yno-load` {
        def -(i: impl.type) = `-Yno-load-impl`
        object `-Yno-load-impl` {
          def -(c: `class`.type) = ScalacYNoLoadImplClass
        }

        // helper method instead of -Yno-load-impl-`class`
        def -(ic: impl_class.type) = ScalacYNoLoadImplClass
      }

      def -(p: predef.type) = ScalacYNoPredef
    }
  }
}
