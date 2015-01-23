package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYDisableDSL extends ScalacDSL {
  object Ydisable {
    val unary_- = `-Ydisable`
    object `-Ydisable` {
      def -(u: unreachable.type) = `-Ydisable-unreachable`
      object `-Ydisable-unreachable` {
        def -(p: prevention.type) = ScalacYDisableUnreachablePrevention
      }
    }
  }
}
