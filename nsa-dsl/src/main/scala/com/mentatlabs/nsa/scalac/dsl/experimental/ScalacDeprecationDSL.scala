package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacDeprecationDSL
    extends ScalacExperimentalDSL {

  object deprecation {
    val unary_- = options.ScalacDeprecation

    def apply(value: Boolean) = new {
      def unary_- = options.ScalacDeprecation(value)
    }
  }
}
