package com.mentatlabs.nsa
package experimental_dsl

trait YreplDSL extends ExperimentalDSL {
  object Yrepl {
    val unary_- = `-Yrepl`
    object `-Yrepl` {
      def -(s: sync.type) = `-Yrepl-sync`
    }
  }
}
