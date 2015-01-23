package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYPatmatDSL extends ScalacDSL {
  object Ypatmat {
    val unary_- = `-Ypatmat`
    object `-Ypatmat` {
      def -(d: debug.type) = ScalacYPatmatDebug
    }
  }
}
