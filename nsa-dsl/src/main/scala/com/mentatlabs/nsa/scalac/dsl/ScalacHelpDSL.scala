package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacHelpDSL
    extends ScalacOptionDSL {

  object help {
    val unary_- = ScalacHelp
  }
}
