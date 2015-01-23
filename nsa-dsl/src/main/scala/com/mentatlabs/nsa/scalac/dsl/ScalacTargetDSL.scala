package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacTargetDSL extends ScalacDSL {
  object target {
    val unary_- = ScalacTarget
  }
}
