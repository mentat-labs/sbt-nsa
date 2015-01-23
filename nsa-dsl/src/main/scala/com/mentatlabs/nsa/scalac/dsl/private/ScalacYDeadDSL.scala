package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYDeadDSL extends ScalacDSL {
  object Ydead {
    val unary_- = `-Ydead`
    object `-Ydead` {
      def -(c: code.type) = ScalacYDeadCode
    }
  }
}
