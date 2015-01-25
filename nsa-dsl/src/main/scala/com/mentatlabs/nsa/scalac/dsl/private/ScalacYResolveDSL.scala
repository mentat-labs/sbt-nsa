package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYResolveDSL
    extends ScalacOptionDSL {

  object Yresolve {
    val unary_- = `-Yresolve`
    object `-Yresolve` {
      def -(t: term.type) = `-Yresolve-term`
      object `-Yresolve-term` {
        def -(c: conflict.type) = ScalacYResolveTermConflict
        def -(c: conflict.WithString) = ScalacYResolveTermConflict(c.value)
      }
    }
  }
}
