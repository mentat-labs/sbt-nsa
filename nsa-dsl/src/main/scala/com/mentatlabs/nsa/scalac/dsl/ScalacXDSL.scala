package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXDSL
    extends ScalacOptionDSL {

  object X {
    val unary_- = ScalacX
  }
}
