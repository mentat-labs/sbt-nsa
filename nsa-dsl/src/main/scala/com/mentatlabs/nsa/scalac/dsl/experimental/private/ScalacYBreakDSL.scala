package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYBreakDSL
    extends ScalacExperimentalDSL {

  object Ybreak {
    val unary_- = new {
      def -(c: cycles.type) = options.ScalacYBreakCycles
    }
  }
}
