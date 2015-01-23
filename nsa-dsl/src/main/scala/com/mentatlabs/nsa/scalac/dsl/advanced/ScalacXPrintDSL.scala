package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXPrintDSL extends ScalacDSL {
  object Xprint {
    val unary_- = `-Xprint`
    object `-Xprint` {
      def -(p: pos.type) = ScalacXPrintPos
      def -(t: types.type) = ScalacXPrintTypes
    }
  }
}
