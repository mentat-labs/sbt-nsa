package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYDocDSL
    extends ScalacExperimentalDSL {

  object Ydoc {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYDocDebug
    }
  }
}
