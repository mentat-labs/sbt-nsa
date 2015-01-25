package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacGDSL
    extends ScalacOptionDSL {

  object g {
    val unary_- = ScalacG

    def apply(level: String) = new {
      def unary_- = ScalacG(level)
    }
  }
}
