package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYSkipDSL extends ScalacDSL {
  object Yskip {
    val unary_- = ScalacYSkip
  }
}
