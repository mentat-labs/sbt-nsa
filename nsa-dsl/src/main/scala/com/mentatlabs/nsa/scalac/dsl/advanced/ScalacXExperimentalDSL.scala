package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXExperimentalDSL
    extends ScalacOptionDSL {

  object Xexperimental {
    val unary_- = ScalacXExperimental
  }
}
