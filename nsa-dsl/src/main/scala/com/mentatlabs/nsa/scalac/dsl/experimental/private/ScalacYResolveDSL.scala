package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYResolveDSL
    extends ScalacExperimentalDSL {

  object Yresolve {
    val unary_- = new {
      def -(t: term.type) = new {
        def -(c: conflict.type) = options.ScalacYResolveTermConflict
        def -(c: conflict.WithString) = options.ScalacYResolveTermConflict(c.value)
      }
    }
  }
}
