package hr.element.nsa
package dsl

object debug
object lite

object Ymacro {
  val unary_- = `-Ymacro`
  object `-Ymacro` {
    def -(d: debug.type) = `-Ymacro-debug`
    object `-Ymacro-debug` {
      def -(l: lite.type) = `-Ymacro-debug-lite`
      def -(v: verbose.type) = `-Ymacro-debug-verbose`
    }
  }
}
