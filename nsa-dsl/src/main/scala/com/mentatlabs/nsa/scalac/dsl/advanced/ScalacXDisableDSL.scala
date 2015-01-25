package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXDisableDSL
    extends ScalacOptionDSL {

  object Xdisable {
    val unary_- = `-Xdisable`
    object `-Xdisable` {
      def -(a: assertions.type) = ScalacXDisableAssertions
    }
  }
}
