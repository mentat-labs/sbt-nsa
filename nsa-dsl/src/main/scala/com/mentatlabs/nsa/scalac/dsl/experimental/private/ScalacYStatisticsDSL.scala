package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYStatisticsDSL
    extends ScalacExperimentalDSL {

  object Ystatistics {
    val unary_- = options.ScalacYStatistics

    def apply(phase: String) = new {
      def unary_- = options.ScalacYStatistics(phase)
    }
  }
}
