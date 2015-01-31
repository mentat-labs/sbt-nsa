package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacUniqidDSL
    extends ScalacExperimentalDSL {

  object uniqid {
    val unary_- = options.ScalacUniqid
  }
}
