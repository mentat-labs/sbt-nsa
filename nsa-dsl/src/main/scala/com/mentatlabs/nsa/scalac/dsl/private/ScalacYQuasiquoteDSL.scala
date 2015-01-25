package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYQuasiquoteDSL
    extends ScalacOptionDSL {

  object Yquasiquote {
    val unary_- = `-Yquasiquote`
    object `-Yquasiquote` {
      def -(d: debug.type) = ScalacYQuasiquoteDebug
    }
  }
}
