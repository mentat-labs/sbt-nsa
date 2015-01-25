package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacUniqidDSL
    extends ScalacOptionDSL {

  object uniqid {
    val unary_- = ScalacUniqid
  }
}
