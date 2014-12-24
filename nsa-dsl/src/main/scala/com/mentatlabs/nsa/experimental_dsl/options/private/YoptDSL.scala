package com.mentatlabs.nsa
package experimental_dsl

trait YoptDSL extends ExperimentalDSL {
  object Yopt {
    val unary_- = `-Yopt`
  }
}
