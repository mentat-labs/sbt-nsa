package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacLanguageDSL
    extends ScalacExperimentalDSL {

  object language {
    val unary_- = options.ScalacLanguage

    def apply(feature: String) = new {
      def unary_- = options.ScalacLanguage(feature)
    }
  }
}
