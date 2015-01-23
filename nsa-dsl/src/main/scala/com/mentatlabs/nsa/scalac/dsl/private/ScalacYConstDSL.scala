package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYConstDSL extends ScalacDSL {
  object Yconst {
    val unary_- = `-Yconst`
    object `-Yconst` {
      def -(o: opt.type) = ScalacYConstOpt
    }
  }
}
