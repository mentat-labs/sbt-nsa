package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacVerboseDSL extends ScalacDSL {
  object verbose {
    val unary_- = ScalacVerbose
  }
}
