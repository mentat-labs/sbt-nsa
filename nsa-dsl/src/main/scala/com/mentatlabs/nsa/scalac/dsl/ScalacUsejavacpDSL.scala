package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacUsejavacpDSL
    extends ScalacOptionDSL {

  object usejavacp {
    val unary_- = ScalacUsejavacp
  }
}
