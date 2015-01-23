package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYStatisticsDSL extends ScalacDSL {
  object Ystatistics {
    val unary_- = ScalacYStatistics
  }
}
