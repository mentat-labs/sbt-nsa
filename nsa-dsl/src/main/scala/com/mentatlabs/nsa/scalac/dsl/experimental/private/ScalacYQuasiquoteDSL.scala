package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYQuasiquoteDSL
    extends ScalacExperimentalDSL {

  object Yquasiquote {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYQuasiquoteDebug
    }
  }
}
