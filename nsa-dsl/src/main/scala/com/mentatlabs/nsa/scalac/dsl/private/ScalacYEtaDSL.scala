package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYEtaDSL
    extends ScalacOptionDSL {

  object Yeta {
    val unary_- = `-Yeta`
    object `-Yeta` {
      def -(e: expand.type) = `-Yeta-expand`
      object `-Yeta-expand` {
        def -(k: keeps.type) = `-Yeta-expand-keeps`
        object `-Yeta-expand-keeps` {
          def -(s: star.type) = ScalacYEtaExpandKeepsStar
        }
      }
    }
  }
}
