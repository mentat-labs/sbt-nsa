package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYReplDSL
    extends ScalacExperimentalDSL {

  object Yrepl {
    val unary_- = new {
      def -(c: `class`.type) = new {
        def -(b: based.type) = options.ScalacYReplClassBased
      }

      // helper method instead of -Yrepl-`class`-based
      def -(cb: class_based.type) = options.ScalacYReplClassBased

      def -(s: sync.type) = options.ScalacYReplSync
    }
  }

  // helper method instead of -Yrepl-`class`
  object Yrepl_class {
    val unary_- = -Yrepl-`class`
  }
}
