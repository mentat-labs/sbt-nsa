package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacNowarnDSL
    extends ScalacOptionDSL {

  object nowarn {
    val unary_- = ScalacNowarn
  }
}
