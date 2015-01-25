package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXShowDSL
    extends ScalacOptionDSL {

  object Xshow {
    val unary_- = `-Xshow`
    object `-Xshow` {
      def -(p: phases.type) = ScalacXShowPhases
    }
  }
}
