package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXVerifyDSL
    extends ScalacExperimentalDSL {

  object Xverify {
    val unary_- = options.ScalacXVerify
  }
}
