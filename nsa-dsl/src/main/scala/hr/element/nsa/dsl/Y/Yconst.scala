package hr.element.nsa
package dsl

object opt

object Yconst {
  val unary_- = `-Yconst`
  object `-Yconst` {
    def -(o: opt.type) = `-Yconst-opt`
  }
}
