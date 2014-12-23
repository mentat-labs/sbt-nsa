package com.mentatlabs.nsa
package experimental_dsl

trait YbreakDSL extends ExperimentalDSL {
  object Ybreak {
    val unary_- = `-Ybreak`
    object `-Ybreak` {
      def -(c: cycles.type) = `-Ybreak-cycles`
    }
  }
}
