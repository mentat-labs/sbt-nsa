package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYBackendDSL extends ScalacDSL {
  object Ybackend {
    val unary_- = ScalacYBackend
  }
}
