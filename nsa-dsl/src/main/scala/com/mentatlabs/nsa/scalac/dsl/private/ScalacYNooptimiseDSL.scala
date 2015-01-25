package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYNooptimiseDSL
    extends ScalacOptionDSL {

  object Ynooptimise {
    val unary_- = ScalacYNooptimise
  }
}
