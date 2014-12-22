package com.mentatlabs.nsa
package experimental_dsl

trait XdevDSL extends ExperimentalDSL {
  object Xdev {
    val unary_- = `-Xdev`
  }
}
