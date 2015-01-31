package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYStopDSL
    extends ScalacExperimentalDSL {

  object Ystop {
    val unary_- = new {
      def -(a: after.type) = options.ScalacYStopAfter
      def -(a: after.WithString) = options.ScalacYStopAfter(a.value)

      def -(b: before.type) = options.ScalacYStopBefore
      def -(b: before.WithString2) = options.ScalacYStopBefore(b.value)
    }
  }
}
