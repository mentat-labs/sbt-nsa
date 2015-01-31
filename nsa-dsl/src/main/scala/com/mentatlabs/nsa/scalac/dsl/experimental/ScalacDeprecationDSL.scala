package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacDeprecationDSL
    extends ScalacExperimentalDSL {

  object deprecation {
    val unary_- = options.ScalacDeprecation
  }
}
