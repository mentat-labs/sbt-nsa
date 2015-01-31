package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYDeadDSL
    extends ScalacExperimentalDSL {

  object Ydead {
    val unary_- = new {
      def -(c: code.type) = options.ScalacYDeadCode
    }
  }
}
