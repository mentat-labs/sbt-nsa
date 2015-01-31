package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYIdeDSL
    extends ScalacExperimentalDSL {

  object Yide {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYIdeDebug
    }
  }
}
