package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYReifyDSL extends ScalacDSL {
  object Yreify {
    val unary_- = `-Yreify`
    object `-Yreify` {
      def -(c: copypaste.type) = ScalacYReifyCopypaste
      def -(d: debug.type) = ScalacYReifyDebug
    }
  }
}
