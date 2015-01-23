package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYDocDSL extends ScalacDSL {
  object Ydoc {
    val unary_- = `-Ydoc`
    object `-Ydoc` {
      def -(d: debug.type) = ScalacYDocDebug
    }
  }
}
