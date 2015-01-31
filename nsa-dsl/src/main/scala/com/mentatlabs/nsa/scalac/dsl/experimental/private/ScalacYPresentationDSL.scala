package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYPresentationDSL
    extends ScalacExperimentalDSL
    with ScalacVerboseDSL {

  object Ypresentation {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYPresentationDebug
      def -(s: strict.type) = options.ScalacYPresentationStrict
      def -(v: verbose.type) = options.ScalacYPresentationVerbose
    }
  }
}
