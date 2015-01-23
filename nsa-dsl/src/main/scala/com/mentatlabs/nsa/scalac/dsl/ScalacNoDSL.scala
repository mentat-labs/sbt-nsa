package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacNoDSL extends ScalacDSL {
  object no {
    val unary_- = `-no`
    object `-no` {
      def -(s: specialization.type) = ScalacNoSpecialization
    }
  }
}
