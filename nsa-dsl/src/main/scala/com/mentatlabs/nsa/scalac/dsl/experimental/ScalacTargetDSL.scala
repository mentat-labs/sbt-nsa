package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacTargetDSL
    extends ScalacExperimentalDSL {

  object target {
    val unary_- = options.ScalacTarget

    def apply(target: String) = new {
      def unary_- = options.ScalacTarget(target)
    }
  }
}
