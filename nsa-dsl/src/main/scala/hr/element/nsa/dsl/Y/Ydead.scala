package hr.element.nsa
package dsl

object Ydead {
  val unary_- = `-Ydead`
  object `-Ydead` {
    def -(c: code.type) = `-Ydead-code`
  }
}
