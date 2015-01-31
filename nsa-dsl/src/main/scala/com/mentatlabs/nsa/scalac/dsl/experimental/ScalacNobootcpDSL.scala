package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacNobootcpDSL
    extends ScalacExperimentalDSL {

  object nobootcp {
    val unary_- = options.ScalacNobootcp
  }
}
