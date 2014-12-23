package com.mentatlabs.nsa
package experimental_dsl

trait YlogDSL extends ExperimentalDSL {
  object Ylog {
    val unary_- = `-Ylog`
    object `-Ylog` {
      def -(c: classpath.type) = `-Ylog-classpath`
    }
  }
}
