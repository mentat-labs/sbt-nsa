package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYEtaDSL
    extends ScalacExperimentalDSL {

  object Yeta {
    val unary_- = new {
      def -(e: expand.type) = new {
        def -(k: keeps.type) = new {
          def -(s: star.type) = options.ScalacYEtaExpandKeepsStar
        }
      }
    }
  }
}
