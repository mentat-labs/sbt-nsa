package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacGDSL
    extends ScalacExperimentalDSL {

  object g {
    val unary_- = options.ScalacG

    def apply(level: String) = new {
      def unary_- = options.ScalacG(level)
    }
  }
}
