package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYMacroDSL extends ScalacDSL with ScalacVerboseDSL with ScalacNoDSL {
  object Ymacro {
    val unary_- = `-Ymacro`
    object `-Ymacro` {
      def -(d: debug.type) = `-Ymacro-debug`
      object `-Ymacro-debug` {
        def -(l: lite.type) = ScalacYMacroDebugLite
        def -(v: verbose.type) = ScalacYMacroDebugVerbose
      }

      def -(e: expand.type) = ScalacYMacroExpand

      def -(n: no.type) = `-Ymacro-no`
      object `-Ymacro-no` {
        def -(e: expand.type) = ScalacYMacroNoExpand
      }
    }
  }
}
