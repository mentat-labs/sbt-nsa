package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYConstDSL
    extends ScalacExperimentalDSL {

  object Yconst {
    val unary_- = new {
      def -(o: opt.type) = options.ScalacYConstOpt
    }
  }
}
