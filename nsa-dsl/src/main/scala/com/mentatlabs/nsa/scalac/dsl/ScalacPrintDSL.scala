package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacPrintDSL
    extends ScalacOptionDSL {

  object print {
    val unary_- = ScalacPrint
  }
}
