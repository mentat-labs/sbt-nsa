package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacUsejavacpDSL
    extends ScalacExperimentalDSL {

  object usejavacp {
    val unary_- = options.ScalacUsejavacp
  }
}
