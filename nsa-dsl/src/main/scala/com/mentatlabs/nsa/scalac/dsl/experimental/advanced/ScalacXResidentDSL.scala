package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXResidentDSL
    extends ScalacExperimentalDSL {

  object Xresident {
    val unary_- = options.ScalacXResident
  }
}
