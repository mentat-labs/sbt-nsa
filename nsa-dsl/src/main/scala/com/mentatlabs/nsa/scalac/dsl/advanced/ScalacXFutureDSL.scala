package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXFutureDSL
    extends ScalacOptionDSL {

  object Xfuture {
    val unary_- = ScalacXFuture
  }
}
