package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYIdeDSL
    extends ScalacOptionDSL {

  object Yide {
    val unary_- = `-Yide`
    object `-Yide` {
      def -(d: debug.type) = ScalacYIdeDebug
    }
  }
}
