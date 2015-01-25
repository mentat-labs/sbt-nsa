package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacNobootcpDSL
    extends ScalacOptionDSL {

  object nobootcp {
    val unary_- = ScalacNobootcp
  }
}
