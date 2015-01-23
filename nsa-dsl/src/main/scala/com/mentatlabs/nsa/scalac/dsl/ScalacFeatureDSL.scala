package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacFeatureDSL extends ScalacDSL {
  object feature {
    val unary_- = ScalacFeature
  }
}
