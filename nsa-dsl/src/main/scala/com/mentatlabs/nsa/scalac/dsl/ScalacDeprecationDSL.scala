package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacDeprecationDSL
    extends ScalacOptionDSL {

  object deprecation {
    val unary_- = ScalacDeprecation
  }
}
