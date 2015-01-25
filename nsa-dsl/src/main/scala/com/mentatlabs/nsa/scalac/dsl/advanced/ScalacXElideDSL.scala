package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXElideDSL
    extends ScalacOptionDSL {

  object Xelide {
    val unary_- = `-Xelide`
    object `-Xelide` {
      def -(b: below.type) = ScalacXElideBelow
      def -(b: below.WithInt) = ScalacXElideBelow(b.value)
    }
  }
}
