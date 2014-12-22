package com.mentatlabs.nsa
package experimental_dsl

trait XfatalDSL extends ExperimentalDSL {
  object Xfatal {
    val unary_- = `-Xfatal`
    object `-Xfatal` {
      def -(w: warnings.type) = `-Xfatal-warnings`
    }
  }
}
