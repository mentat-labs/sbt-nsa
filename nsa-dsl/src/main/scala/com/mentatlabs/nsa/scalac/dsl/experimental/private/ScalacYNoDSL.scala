package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYNoDSL
    extends ScalacExperimentalDSL {

  object Yno {
    val unary_- = new {
      def -(a: adapted.type) = new {
        def -(a: args.type) = options.ScalacYNoAdaptedArgs
      }

      def -(c: completion.type) = options.ScalacYNoCompletion

      def -(g: generic.type) = new {
        def -(s: signatures.type) = options.ScalacYNoGenericSignatures
      }

      def -(i: imports.type) = options.ScalacYNoImports

      def -(l: load.type) = new {
        def -(i: impl.type) = new {
          def -(c: `class`.type) = options.ScalacYNoLoadImplClass
        }

        // helper method instead of -Yno-load-impl-`class`
        def -(ic: impl_class.type) = options.ScalacYNoLoadImplClass
      }

      def -(p: predef.type) = options.ScalacYNoPredef
    }
  }
}
