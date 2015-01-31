package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXLogDSL
    extends ScalacExperimentalDSL {

  object Xlog {
    val unary_- = new {
      def -(f: free.type) = new {
        def -(t: terms.type) = options.ScalacXLogFreeTerms
        def -(t: types.type) = options.ScalacXLogFreeTypes
      }

      def -(i: `implicit`.type) = new {
        def -(c: conversions.type) = options.ScalacXLogImplicitConversions
      }
      // helper method instead of -Xlog-`implicit`-conversions
      def -(ic: implicit_conversions.type) = options.ScalacXLogImplicitConversions
      def -(i: implicits.type) = options.ScalacXLogImplicits

      def -(r: reflective.type) = new {
        def -(c: calls.type) = options.ScalacXLogReflectiveCalls
      }
    }
  }

  // helper method instead of -Xlog-`implicit`
  object Xlog_implicit {
    val unary_- = -Xlog-`implicit`
  }
}
