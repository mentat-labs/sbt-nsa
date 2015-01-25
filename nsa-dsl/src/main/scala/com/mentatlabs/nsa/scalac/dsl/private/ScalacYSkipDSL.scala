package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYSkipDSL
    extends ScalacOptionDSL {

  object Yskip {
    val unary_- = ScalacYSkip

    def apply(phase: String) = new {
      def unary_- = ScalacYSkip(phase)
    }
  }
}
