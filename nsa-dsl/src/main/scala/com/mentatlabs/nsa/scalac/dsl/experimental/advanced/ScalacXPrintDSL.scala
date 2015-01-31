package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXPrintDSL
    extends ScalacExperimentalDSL {

  object Xprint {
    val unary_- = new {
      def -(p: pos.type) = options.ScalacXPrintPos
      def -(t: types.type) = options.ScalacXPrintTypes
    }
  }
}
