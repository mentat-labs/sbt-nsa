package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYTyperDSL extends ScalacDSL {
  object Ytyper {
    val unary_- = `-Ytyper`
    object `-Ytyper` {
      def -(d: debug.type) = ScalacYTyperDebug
    }
  }
}
