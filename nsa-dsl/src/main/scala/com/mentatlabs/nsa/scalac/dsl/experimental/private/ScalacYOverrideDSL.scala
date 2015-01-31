package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYOverrideDSL
    extends ScalacExperimentalDSL {

  object Yoverride {
    val unary_- = new {
      def -(o: objects.type) = options.ScalacYOverrideObjects
      def -(v: vars.type) = options.ScalacYOverrideVars
    }
  }
}
