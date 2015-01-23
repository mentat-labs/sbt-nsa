package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXFatalDSL extends ScalacDSL {
  object Xfatal {
    val unary_- = `-Xfatal`
    object `-Xfatal` {
      def -(w: warnings.type) = ScalacXFatalWarnings
    }
  }
}
