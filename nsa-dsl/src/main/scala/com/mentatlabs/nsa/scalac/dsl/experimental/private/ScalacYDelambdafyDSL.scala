package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYDelambdafyDSL
    extends ScalacExperimentalDSL {

  object Ydelambdafy {
    val unary_- = options.ScalacYDelambdafy

    def apply(strategy: String) = new {
      def unary_- = options.ScalacYDelambdafy(strategy)
    }
  }
}
