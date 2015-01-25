package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYBackendDSL
    extends ScalacOptionDSL {

  object Ybackend {
    val unary_- = ScalacYBackend

    def apply(bytecodeEmitter: String) = new {
      def unary_- = ScalacYBackend(bytecodeEmitter)
    }
  }
}
