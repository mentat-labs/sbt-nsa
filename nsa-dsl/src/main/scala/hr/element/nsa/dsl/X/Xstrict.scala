package hr.element.nsa
package dsl

object inference

object Xstrict {
  val unary_- = `-Xstrict`
  object `-Xstrict` {
    def -(i: inference.type) = `-Xstrict-inference`
  }
}
