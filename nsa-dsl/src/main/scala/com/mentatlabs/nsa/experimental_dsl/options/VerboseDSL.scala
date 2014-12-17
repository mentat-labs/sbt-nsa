package com.mentatlabs.nsa
package experimental_dsl

trait VerboseDSL extends ExperimentalDSL {
  object verbose {
    val unary_- = `-verbose`
  }
}
