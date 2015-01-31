package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacHelpDSL
    extends ScalacExperimentalDSL {

  object help {
    val unary_- = options.ScalacHelp
  }
}
