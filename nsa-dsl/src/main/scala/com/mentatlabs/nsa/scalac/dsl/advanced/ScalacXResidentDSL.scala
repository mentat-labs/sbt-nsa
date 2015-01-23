package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXResidentDSL extends ScalacDSL {
  object Xresident {
    val unary_- = ScalacXResident
  }
}
