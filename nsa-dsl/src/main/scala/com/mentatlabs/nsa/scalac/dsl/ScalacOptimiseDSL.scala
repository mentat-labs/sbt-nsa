package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacOptimiseDSL
    extends ScalacOptionDSL {

  object optimise {
    val unary_- = ScalacOptimise
  }
}
