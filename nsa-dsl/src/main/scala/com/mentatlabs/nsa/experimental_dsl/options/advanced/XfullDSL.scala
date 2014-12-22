package com.mentatlabs.nsa
package experimental_dsl

trait XfullDSL extends ExperimentalDSL {
  object Xfull {
    val unary_- = `-Xfull`
    object `-Xfull` {
      def -(l: lubs.type) = `-Xfull-lubs`
    }
  }
}
