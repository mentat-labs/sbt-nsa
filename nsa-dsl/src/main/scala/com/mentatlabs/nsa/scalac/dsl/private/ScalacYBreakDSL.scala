package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYBreakDSL
    extends ScalacOptionDSL {

  object Ybreak {
    val unary_- = `-Ybreak`
    object `-Ybreak` {
      def -(c: cycles.type) = ScalacYBreakCycles
    }
  }
}
