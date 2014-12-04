package hr.element.nsa
package dsl

object pos

object Xprint {
  val unary_- = `-Xprint`
  object `-Xprint` {
    def -(p: pos.type) = `-Xprint-pos`
    def -(t: types.type) = `-Xprint-types`
  }
}
