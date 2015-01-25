package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXLintDSL
    extends ScalacOptionDSL {

  object Xlint {
    val unary_- = ScalacXLint

    def apply(warning: String) = new {
      def unary_- = ScalacXLint(warning)
    }
  }
}
