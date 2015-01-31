package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacPrintDSL
    extends ScalacExperimentalDSL {

  object print {
    val unary_- = options.ScalacPrint
  }
}
