package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacFeatureDSL
    extends ScalacExperimentalDSL {

  object feature {
    val unary_- = options.ScalacFeature
  }
}
