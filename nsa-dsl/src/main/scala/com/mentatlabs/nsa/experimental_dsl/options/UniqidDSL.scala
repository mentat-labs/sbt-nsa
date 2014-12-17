package com.mentatlabs.nsa
package experimental_dsl

trait UniqidDSL extends ExperimentalDSL {
  object uniqid {
    val unary_- = `-uniqid`
  }
}
