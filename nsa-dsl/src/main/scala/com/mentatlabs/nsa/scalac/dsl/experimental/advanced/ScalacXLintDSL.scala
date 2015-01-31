package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXLintDSL
    extends ScalacExperimentalDSL {

  object Xlint {
    val unary_- = options.ScalacXLint

    def apply(warning: String) = new {
      def unary_- = options.ScalacXLint(warning)
    }
  }
}
