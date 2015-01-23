package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYDSL extends ScalacDSL {
  object Y {
    val unary_- = ScalacY
  }
}
