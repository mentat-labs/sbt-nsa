package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYCompactDSL
    extends ScalacOptionDSL {

  object Ycompact {
    val unary_- = `-Ycompact`
    object `-Ycompact` {
      def -(t: trees.type) = ScalacYCompactTrees
    }
  }
}
