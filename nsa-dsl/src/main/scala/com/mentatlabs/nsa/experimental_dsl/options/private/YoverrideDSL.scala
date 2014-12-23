package com.mentatlabs.nsa
package experimental_dsl

trait YoverrideDSL extends ExperimentalDSL {
  object Yoverride {
    val unary_- = `-Yoverride`
    object `-Yoverride` {
      def -(o: objects.type) = `-Yoverride-objects`
      def -(v: vars.type) = `-Yoverride-vars`
    }
  }
}
