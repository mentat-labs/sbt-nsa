package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYDSL
    extends ScalacOptionDSL {

  object Y {
    val unary_- = ScalacY
  }
}
