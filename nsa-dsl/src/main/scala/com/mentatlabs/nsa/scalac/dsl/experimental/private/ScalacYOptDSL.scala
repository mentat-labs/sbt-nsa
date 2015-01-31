package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYOptDSL
    extends ScalacExperimentalDSL {

  object Yopt {
    val unary_- = options.ScalacYOpt

    def apply(optimization: String) = new {
      def unary_- = options.ScalacYOpt(optimization)
    }
  }
}
