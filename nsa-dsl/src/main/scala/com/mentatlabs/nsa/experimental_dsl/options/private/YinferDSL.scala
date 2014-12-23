package com.mentatlabs.nsa
package experimental_dsl

trait YinferDSL extends ExperimentalDSL {
  object Yinfer {
    val unary_- = `-Yinfer`
    object `-Yinfer` {
      def -(a: argument.type) = `-Yinfer-argument`
      object `-Yinfer-argument` {
        def -(t: types.type) = `-Yinfer-argument-types`
      }

      def -(b: by.type) = `-Yinfer-by`
      object `-Yinfer-by` {
        def -(n: name.type) = `-Yinfer-by-name`
      }

      def -(d: debug.type) = `-Yinfer-debug`
    }
  }
}
