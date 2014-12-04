package hr.element.nsa
package dsl

object elim

object Yclosure {
  val unary_- = `-Yclosure`
  object `-Yclosure` {
    def -(e: elim.type) = `-Yclosure-elim`
  }
}
