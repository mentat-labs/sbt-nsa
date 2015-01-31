package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYPosDSL
    extends ScalacExperimentalDSL {

  object Ypos {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYPosDebug
    }
  }
}
