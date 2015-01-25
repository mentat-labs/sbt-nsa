package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYStopDSL
    extends ScalacOptionDSL {

  object Ystop {
    val unary_- = `-Ystop`

    object `-Ystop` {
      def -(a: after.type) = ScalacYStopAfter
      def -(a: after.WithString) = ScalacYStopAfter(a.value)

      def -(b: before.type) = ScalacYStopBefore
      def -(b: before.WithString2) = ScalacYStopBefore(b.value)
    }
  }
}
