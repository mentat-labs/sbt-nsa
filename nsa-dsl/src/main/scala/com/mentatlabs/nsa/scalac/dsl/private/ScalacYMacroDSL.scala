package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYMacroDSL
    extends ScalacOptionDSL with ScalacVerboseDSL with ScalacNoDSL {

  object Ymacro {
    val unary_- = `-Ymacro`
    object `-Ymacro` {
      def -(d: debug.type) = `-Ymacro-debug`
      object `-Ymacro-debug` {
        def -(l: lite.type) = ScalacYMacroDebugLite
        def -(v: verbose.type) = ScalacYMacroDebugVerbose
      }

      def -(e: expand.type) = ScalacYMacroExpand
      def -(e: expand.WithString) = ScalacYMacroExpand(e.value)

      def -(n: no.type) = `-Ymacro-no`
      object `-Ymacro-no` {
        def -(e: expand.type) = ScalacYMacroNoExpand
      }
    }
  }
}
