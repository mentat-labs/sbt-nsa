package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacUncheckedDSL
    extends ScalacOptionDSL {

  object unchecked {
    val unary_- = ScalacUnchecked
  }
}
