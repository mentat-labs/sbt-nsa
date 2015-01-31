package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXShowDSL
    extends ScalacExperimentalDSL {

  object Xshow {
    val unary_- = `-Xshow`
    object `-Xshow` {
      def -(p: phases.type) = options.ScalacXShowPhases
    }
  }
}
