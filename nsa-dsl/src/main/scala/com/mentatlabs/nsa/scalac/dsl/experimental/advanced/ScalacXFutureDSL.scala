package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXFutureDSL
    extends ScalacExperimentalDSL {

  object Xfuture {
    val unary_- = options.ScalacXFuture
  }
}
