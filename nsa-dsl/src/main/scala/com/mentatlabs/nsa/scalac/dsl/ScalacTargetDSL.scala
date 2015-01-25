package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacTargetDSL
    extends ScalacOptionDSL {

  object target {
    val unary_- = ScalacTarget

    def apply(target: String) = new {
      def unary_- = ScalacTarget(target)
    }
  }
}
