package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYDisableDSL
    extends ScalacExperimentalDSL {

  object Ydisable {
    val unary_- = new {
      def -(u: unreachable.type) = new {
        def -(p: prevention.type) = options.ScalacYDisableUnreachablePrevention
      }
    }
  }
}
