package com.mentatlabs.nsa
package experimental_dsl

trait UncheckedDSL extends ExperimentalDSL {
  object unchecked {
    val unary_- = `-unchecked`
  }
}
