package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYSkipDSL
    extends ScalacExperimentalDSL {

  object Yskip {
    val unary_- = options.ScalacYSkip

    def apply(phase: String) = new {
      def unary_- = options.ScalacYSkip(phase)
    }
  }
}
