package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacNoDSL
    extends ScalacExperimentalDSL {

  object no {
    val unary_- = new {
      def -(s: specialization.type) = options.ScalacNoSpecialization
    }
  }
}
