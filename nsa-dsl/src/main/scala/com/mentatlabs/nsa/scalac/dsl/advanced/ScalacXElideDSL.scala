package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXElideDSL extends ScalacDSL {
  object Xelide {
    val unary_- = `-Xelide`
    object `-Xelide` {
      def -(b: below.type) = ScalacXElideBelow
    }
  }
}
