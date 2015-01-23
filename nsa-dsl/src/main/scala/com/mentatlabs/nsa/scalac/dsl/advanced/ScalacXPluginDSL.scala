package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXPluginDSL extends ScalacDSL {
  object Xplugin {
    val unary_- = `-Xplugin`
    object `-Xplugin` {
      def -(l: list.type) = ScalacXPluginList
    }
  }
}
