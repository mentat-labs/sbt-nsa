package com.mentatlabs.nsa
package experimental_dsl

trait OptimiseDSL extends ExperimentalDSL {
  object optimise {
    val unary_- = `-optimise`
  }
}
