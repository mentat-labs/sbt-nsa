package com.mentatlabs.nsa
package experimental_dsl

trait YnooptimiseDSL extends ExperimentalDSL {
  object Ynooptimise {
    val unary_- = `-Ynooptimise`
  }
}
