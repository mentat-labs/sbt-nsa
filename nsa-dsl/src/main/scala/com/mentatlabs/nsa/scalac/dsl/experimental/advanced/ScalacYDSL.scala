package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYDSL
    extends ScalacExperimentalDSL {

  object Y {
    val unary_- = options.ScalacY
  }
}
