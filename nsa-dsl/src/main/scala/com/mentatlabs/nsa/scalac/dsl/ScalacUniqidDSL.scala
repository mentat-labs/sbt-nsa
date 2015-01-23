package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacUniqidDSL extends ScalacDSL {
  object uniqid {
    val unary_- = ScalacUniqid
  }
}
