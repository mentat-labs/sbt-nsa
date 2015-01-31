package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYPatmatDSL
    extends ScalacExperimentalDSL {

  object Ypatmat {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYPatmatDebug
    }
  }
}
