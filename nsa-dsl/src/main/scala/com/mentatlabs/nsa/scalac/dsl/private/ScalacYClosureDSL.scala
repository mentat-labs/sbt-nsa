package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYClosureDSL
    extends ScalacOptionDSL {

  object Yclosure {
    val unary_- = `-Yclosure`
    object `-Yclosure` {
      def -(e: elim.type) = ScalacYClosureElim
    }
  }
}
