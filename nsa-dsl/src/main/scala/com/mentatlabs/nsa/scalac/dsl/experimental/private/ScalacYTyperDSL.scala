package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYTyperDSL
    extends ScalacExperimentalDSL {

  object Ytyper {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYTyperDebug
    }
  }
}
