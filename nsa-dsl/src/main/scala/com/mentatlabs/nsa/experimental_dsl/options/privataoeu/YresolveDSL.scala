package com.mentatlabs.nsa
package experimental_dsl

trait YresolveDSL extends ExperimentalDSL {
  object Yresolve {
    val unary_- = `-Yresolve`
    object `-Yresolve` {
      def -(t: term.type) = `-Yresolve-term`
      object `-Yresolve-term` {
        def -(c: conflict.type) = `-Yresolve-term-conflict`
      }
    }
  }
}
