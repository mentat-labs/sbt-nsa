package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacPrintDSL extends ScalacDSL {
  object print {
    val unary_- = ScalacPrint
  }
}
