package com.mentatlabs.nsa
package experimental_dsl

trait XsourceDSL extends ExperimentalDSL {
  object Xsource {
    val unary_- = `-Xsource`
  }
}
