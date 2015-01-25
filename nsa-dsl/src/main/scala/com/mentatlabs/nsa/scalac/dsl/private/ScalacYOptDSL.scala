package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYOptDSL
    extends ScalacOptionDSL {

  object Yopt {
    val unary_- = ScalacYOpt

    def apply(optimization: String) = new {
      def unary_- = ScalacYOpt(optimization)
    }
  }
}
