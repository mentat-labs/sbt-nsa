package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYStopDSL extends ScalacDSL {
  object Ystop {
    val unary_- = `-Ystop`

    object `-Ystop` {
      def -(b: before.type) = ScalacYStopBefore
      def -(a: after.type) = ScalacYStopAfter
    }
  }
}
