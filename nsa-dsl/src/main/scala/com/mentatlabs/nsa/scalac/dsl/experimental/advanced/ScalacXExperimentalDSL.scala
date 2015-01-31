package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXExperimentalDSL
    extends ScalacExperimentalDSL {

  object Xexperimental {
    val unary_- = options.ScalacXExperimental
  }
}
