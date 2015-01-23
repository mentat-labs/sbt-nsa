package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXNojlineDSL extends ScalacDSL {
  object Xnojline {
    val unary_- = ScalacXNojline
  }
}
