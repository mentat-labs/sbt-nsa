package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXNojlineDSL
    extends ScalacOptionDSL {

  object Xnojline {
    val unary_- = ScalacXNojline
  }
}
