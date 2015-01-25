package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXLogDSL
    extends ScalacOptionDSL {

  object Xlog {
    val unary_- = `-Xlog`
    object `-Xlog` {
      def -(f: free.type) = `-Xlog-free`
      object `-Xlog-free` {
        def -(t: terms.type) = ScalacXLogFreeTerms
        def -(t: types.type) = ScalacXLogFreeTypes
      }

      def -(i: `implicit`.type) = `-Xlog-implicit`
      object `-Xlog-implicit` {
        def -(c: conversions.type) = ScalacXLogImplicitConversions
      }
      // helper method instead of -Xlog-`implicit`-conversions
      def -(ic: implicit_conversions.type) = ScalacXLogImplicitConversions
      def -(i: implicits.type) = ScalacXLogImplicits

      def -(r: reflective.type) = `-Xlog-reflective`
      object `-Xlog-reflective` {
        def -(c: calls.type) = ScalacXLogReflectiveCalls
      }
    }
  }

  // helper method instead of -Xlog-`implicit`
  object Xlog_implicit {
    val unary_- = Xlog.`-Xlog`.`-Xlog-implicit`
  }
}
