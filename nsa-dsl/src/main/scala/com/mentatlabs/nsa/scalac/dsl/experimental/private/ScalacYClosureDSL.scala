package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYClosureDSL
    extends ScalacExperimentalDSL {

  object Yclosure {
    val unary_- = new {
      def -(e: elim.type) = options.ScalacYClosureElim
    }
  }
}
