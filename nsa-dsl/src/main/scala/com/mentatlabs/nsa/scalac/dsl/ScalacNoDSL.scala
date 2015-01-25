package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacNoDSL
    extends ScalacOptionDSL {

  object no {
    val unary_- = `-no`
    object `-no` {
      def -(s: specialization.type) = ScalacNoSpecialization
    }
  }
}
