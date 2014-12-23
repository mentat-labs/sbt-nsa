package com.mentatlabs.nsa
package experimental_dsl

trait YreplDSL extends ExperimentalDSL {
  object Yrepl {
    val unary_- = `-Yrepl`
    object `-Yrepl` {
      def -(c: `class`.type) = `-Yrepl-class`
      object `-Yrepl-class` {
        def -(b: based.type) = `-Yrepl-class-based`
      }

      // helper method instead of -Yrepl-`class`-based
      def -(cb: class_based.type) = `-Yrepl-class-based`

      def -(s: sync.type) = `-Yrepl-sync`
    }
  }

  // helper method instead of -Yrepl-`class`
  object Yrepl_class {
    val unary_- = Yrepl.`-Yrepl`.`-Yrepl-class`
  }
}
