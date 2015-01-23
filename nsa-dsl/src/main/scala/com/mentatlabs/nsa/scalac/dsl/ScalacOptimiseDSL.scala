package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacOptimiseDSL extends ScalacDSL {
  object optimise {
    val unary_- = ScalacOptimise
  }
}
