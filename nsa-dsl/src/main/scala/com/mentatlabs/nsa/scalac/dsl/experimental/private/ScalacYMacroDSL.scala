package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYMacroDSL
    extends ScalacExperimentalDSL
    with ScalacVerboseDSL
    with ScalacNoDSL {

  object Ymacro {
    val unary_- = new {
      def -(d: debug.type) = new {
        def -(l: lite.type) = options.ScalacYMacroDebugLite
        def -(v: verbose.type) = options.ScalacYMacroDebugVerbose
      }

      def -(e: expand.type) = options.ScalacYMacroExpand
      def -(e: expand.WithString) = options.ScalacYMacroExpand(e.value)

      def -(n: no.type) = new {
        def -(e: expand.type) = options.ScalacYMacroNoExpand
      }
    }
  }
}
