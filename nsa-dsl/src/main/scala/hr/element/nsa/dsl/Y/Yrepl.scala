package hr.element.nsa
package dsl

object sync

object Yrepl {
  val unary_- = `-Yrepl`
  object `-Yrepl` {
    def -(s: sync.type) = `-Yrepl-sync`
  }
}
