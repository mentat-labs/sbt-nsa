package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXSourceDSL
    extends ScalacExperimentalDSL {

  object Xsource {
    val unary_- = options.ScalacXSource

    def apply(version: String) = new {
      def unary_- = options.ScalacXSource(version)
    }

    def apply(version: ScalacVersion) = new {
      def unary_- = options.ScalacXSource(version)
    }
  }
}
