package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXFullDSL
    extends ScalacOptionDSL {

  object Xfull {
    val unary_- = `-Xfull`
    object `-Xfull` {
      def -(l: lubs.type) = ScalacXFullLubs
    }
  }
}
