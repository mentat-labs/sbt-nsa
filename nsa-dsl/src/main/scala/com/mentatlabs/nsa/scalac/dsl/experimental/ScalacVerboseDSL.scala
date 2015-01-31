package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacVerboseDSL
    extends ScalacExperimentalDSL {

  object verbose {
    val unary_- = options.ScalacVerbose
  }
}
