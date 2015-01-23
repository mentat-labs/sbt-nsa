package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXSourceDSL extends ScalacDSL {
  object Xsource {
    val unary_- = ScalacXSource
  }
}
