package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXFullDSL extends ScalacDSL {
  object Xfull {
    val unary_- = `-Xfull`
    object `-Xfull` {
      def -(l: lubs.type) = ScalacXFullLubs
    }
  }
}
