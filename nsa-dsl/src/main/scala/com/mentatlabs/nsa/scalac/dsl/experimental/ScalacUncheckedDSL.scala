package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacUncheckedDSL
    extends ScalacExperimentalDSL {

  object unchecked {
    val unary_- = options.ScalacUnchecked
  }
}
