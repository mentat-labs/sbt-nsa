package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacVersionDSL
    extends ScalacExperimentalDSL {

  object version {
    val unary_- = options.ScalacVersion
  }
}
