package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXPluginDSL
    extends ScalacExperimentalDSL {

  object Xplugin {
    val unary_- = new {
      def -(l: list.type) = options.ScalacXPluginList
    }
  }
}
