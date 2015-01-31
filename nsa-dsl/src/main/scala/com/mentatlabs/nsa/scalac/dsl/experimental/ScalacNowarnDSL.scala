package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacNowarnDSL
    extends ScalacExperimentalDSL {

  object nowarn {
    val unary_- = options.ScalacNowarn
  }
}
