package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXDSL extends ScalacDSL {
  object X {
    val unary_- = ScalacX
  }
}
