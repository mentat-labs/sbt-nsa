package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYBackendDSL
    extends ScalacExperimentalDSL {

  object Ybackend {
    val unary_- = options.ScalacYBackend

    def apply(bytecodeEmitter: String) = new {
      def unary_- = options.ScalacYBackend(bytecodeEmitter)
    }
  }
}
