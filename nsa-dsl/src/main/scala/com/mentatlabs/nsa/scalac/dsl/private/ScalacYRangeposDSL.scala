package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYRangeposDSL
    extends ScalacOptionDSL {

  object Yrangepos {
    val unary_- = ScalacYRangepos
  }
}
