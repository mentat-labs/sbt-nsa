package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXDisableDSL
    extends ScalacExperimentalDSL {

  object Xdisable {
    val unary_- = new {
      def -(a: assertions.type) = options.ScalacXDisableAssertions
    }
  }
}
