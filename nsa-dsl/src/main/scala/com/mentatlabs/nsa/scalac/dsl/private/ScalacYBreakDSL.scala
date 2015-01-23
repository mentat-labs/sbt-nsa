package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYBreakDSL extends ScalacDSL {
  object Ybreak {
    val unary_- = `-Ybreak`
    object `-Ybreak` {
      def -(c: cycles.type) = ScalacYBreakCycles
    }
  }
}
