package com.mentatlabs.nsa
package experimental_dsl

trait XshowDSL extends ExperimentalDSL {
  object Xshow {
    val unary_- = `-Xshow`
    object `-Xshow` {
      def -(p: phases.type) = `-Xshow-phases`
    }
  }
}
