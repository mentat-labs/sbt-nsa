package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYOptDSL extends ScalacDSL {
  object Yopt {
    val unary_- = ScalacYOpt
  }
}
