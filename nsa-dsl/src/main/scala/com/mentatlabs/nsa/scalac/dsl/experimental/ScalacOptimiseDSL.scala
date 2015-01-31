package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacOptimiseDSL
    extends ScalacExperimentalDSL {

  object optimise {
    val unary_- = options.ScalacOptimise
  }
}
