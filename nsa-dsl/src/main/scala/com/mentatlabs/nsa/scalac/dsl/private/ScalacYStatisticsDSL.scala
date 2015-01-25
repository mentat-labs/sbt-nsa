package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYStatisticsDSL
    extends ScalacOptionDSL {

  object Ystatistics {
    val unary_- = ScalacYStatistics

    def apply(phase: String) = new {
      def unary_- = ScalacYStatistics(phase)
    }
  }
}
