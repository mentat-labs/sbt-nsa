package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXFullDSL
    extends ScalacExperimentalDSL {

  object Xfull {
    val unary_- = new {
      def -(l: lubs.type) = options.ScalacXFullLubs
    }
  }
}
