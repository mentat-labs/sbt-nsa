package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacLanguageDSL
    extends ScalacOptionDSL {

  object language {
    val unary_- = ScalacLanguage

    def apply(feature: String) = new {
      def unary_- = ScalacLanguage(feature)
    }
  }
}
