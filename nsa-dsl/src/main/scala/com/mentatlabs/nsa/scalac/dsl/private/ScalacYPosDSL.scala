package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYPosDSL extends ScalacDSL {
  object Ypos {
    val unary_- = `-Ypos`
    object `-Ypos` {
      def -(d: debug.type) = ScalacYPosDebug
    }
  }
}
