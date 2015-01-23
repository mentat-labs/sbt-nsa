package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXLintDSL extends ScalacDSL {
  object Xlint {
    val unary_- = ScalacXLint
  }
}
