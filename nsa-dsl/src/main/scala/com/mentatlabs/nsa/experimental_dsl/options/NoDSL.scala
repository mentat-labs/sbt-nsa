package com.mentatlabs.nsa
package experimental_dsl

trait NoDSL extends ExperimentalDSL {
  object no {
    val unary_- = `-no`
    object `-no` {
      def -(s: specialization.type) = `-no-specialization`
    }
  }
}
