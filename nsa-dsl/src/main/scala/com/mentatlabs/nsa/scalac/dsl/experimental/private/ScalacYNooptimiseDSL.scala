package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYNooptimiseDSL
    extends ScalacExperimentalDSL {

  object Ynooptimise {
    val unary_- = options.ScalacYNooptimise
  }
}
