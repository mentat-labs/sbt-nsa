package com.mentatlabs.nsa
package experimental_dsl

trait XverifyDSL extends ExperimentalDSL {
  object Xverify {
    val unary_- = `-Xverify`
  }
}
