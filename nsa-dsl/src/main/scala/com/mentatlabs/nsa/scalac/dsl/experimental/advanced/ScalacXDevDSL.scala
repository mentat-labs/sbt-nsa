package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXDevDSL
    extends ScalacExperimentalDSL {

  object Xdev {
    val unary_- = options.ScalacXDev
  }
}
