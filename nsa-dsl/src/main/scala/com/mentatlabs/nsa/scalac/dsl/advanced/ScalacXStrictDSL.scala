package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXStrictDSL
    extends ScalacOptionDSL {

  object Xstrict {
    val unary_- = `-Xstrict`
    object `-Xstrict` {
      def -(i: inference.type) = ScalacXStrictInference
    }
  }
}
