package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYReifyDSL
    extends ScalacExperimentalDSL {

  object Yreify {
    val unary_- = new {
      def -(c: copypaste.type) = options.ScalacYReifyCopypaste
      def -(d: debug.type) = options.ScalacYReifyDebug
    }
  }
}
