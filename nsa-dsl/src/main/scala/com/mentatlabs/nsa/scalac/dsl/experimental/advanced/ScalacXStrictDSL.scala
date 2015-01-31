package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXStrictDSL
    extends ScalacExperimentalDSL {

  object Xstrict {
    val unary_- = new {
      def -(i: inference.type) = options.ScalacXStrictInference
    }
  }
}
