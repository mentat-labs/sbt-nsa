package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYReplDSL extends ScalacDSL {
  object Yrepl {
    val unary_- = `-Yrepl`
    object `-Yrepl` {
      def -(c: `class`.type) = `-Yrepl-class`
      object `-Yrepl-class` {
        def -(b: based.type) = ScalacYReplClassBased
      }

      // helper method instead of -Yrepl-`class`-based
      def -(cb: class_based.type) = ScalacYReplClassBased

      def -(s: sync.type) = ScalacYReplSync
    }
  }

  // helper method instead of -Yrepl-`class`
  object Yrepl_class {
    val unary_- = Yrepl.`-Yrepl`.`-Yrepl-class`
  }
}
