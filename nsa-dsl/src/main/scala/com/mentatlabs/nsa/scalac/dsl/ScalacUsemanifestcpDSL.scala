package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacUsemanifestcpDSL
    extends ScalacOptionDSL {

  object usemanifestcp {
    val unary_- = ScalacUsemanifestcp
  }
}
