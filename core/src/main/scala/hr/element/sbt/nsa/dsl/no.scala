package hr.element.sbt.nsa
package dsl

object specialization

object no {
  val unary_- = `-no`
  object `-no` {
    def -(s: specialization.type) = `-no-specialization`
  }
}
