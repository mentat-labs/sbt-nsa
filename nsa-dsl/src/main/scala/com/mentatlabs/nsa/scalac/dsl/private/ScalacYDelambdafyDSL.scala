package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYDelambdafyDSL
    extends ScalacOptionDSL {

  object Ydelambdafy {
    val unary_- = ScalacYDelambdafy

    def apply(strategy: String) = new {
      def unary_- = ScalacYDelambdafy(strategy)
    }
  }
}
