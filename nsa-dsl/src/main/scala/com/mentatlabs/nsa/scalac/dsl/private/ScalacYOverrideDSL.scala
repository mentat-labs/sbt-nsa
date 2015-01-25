package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYOverrideDSL
    extends ScalacOptionDSL {

  object Yoverride {
    val unary_- = `-Yoverride`
    object `-Yoverride` {
      def -(o: objects.type) = ScalacYOverrideObjects
      def -(v: vars.type) = ScalacYOverrideVars
    }
  }
}
