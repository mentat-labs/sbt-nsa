package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXElideDSL
    extends ScalacExperimentalDSL {

  object Xelide {
    val unary_- = new {
      def -(b: below.type) = options.ScalacXElideBelow
      def -(b: below.WithInt) = options.ScalacXElideBelow(b.value)
    }
  }
}
