package com.mentatlabs.nsa
package experimental_dsl

trait XpluginDSL extends ExperimentalDSL {
  object Xplugin {
    val unary_- = `-Xplugin`
    object `-Xplugin` {
      def -(l: list.type) = `-Xplugin-list`
    }
  }
}
