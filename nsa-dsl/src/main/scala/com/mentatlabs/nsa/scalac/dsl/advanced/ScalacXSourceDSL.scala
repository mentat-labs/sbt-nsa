package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXSourceDSL
    extends ScalacOptionDSL {

  object Xsource {
    val unary_- = ScalacXSource

    def apply(version: String) = new {
      def unary_- = ScalacXSource(version)
    }

    def apply(version: ScalacVersion) = new {
      def unary_- = ScalacXSource(version)
    }
  }
}
