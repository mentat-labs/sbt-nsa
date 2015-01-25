package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacVersionDSL
    extends ScalacOptionDSL {

  object version {
    val unary_- = ScalacVersion
  }
}
