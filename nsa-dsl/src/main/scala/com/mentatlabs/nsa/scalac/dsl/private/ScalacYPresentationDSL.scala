package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYPresentationDSL
    extends ScalacOptionDSL with ScalacVerboseDSL {

  object Ypresentation {
    val unary_- = `-Ypresentation`
    object `-Ypresentation` {
      def -(d: debug.type) = ScalacYPresentationDebug
      def -(s: strict.type) = ScalacYPresentationStrict
      def -(v: verbose.type) = ScalacYPresentationVerbose
    }
  }
}
