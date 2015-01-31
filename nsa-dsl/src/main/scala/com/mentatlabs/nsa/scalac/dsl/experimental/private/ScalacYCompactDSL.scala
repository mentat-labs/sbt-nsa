package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYCompactDSL
    extends ScalacExperimentalDSL {

  object Ycompact {
    val unary_- = new {
      def -(t: trees.type) = options.ScalacYCompactTrees
    }
  }
}
