package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXFatalDSL
    extends ScalacExperimentalDSL {

  object Xfatal {
    val unary_- = new {
      def -(w: warnings.type) = options.ScalacXFatalWarnings
    }
  }
}
