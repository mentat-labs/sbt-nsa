package hr.element.sbt.nsa
package dsl

object no {
  val unary_- = `-no`
  object `-no` {
    val - = (_: specialization.type) => `-no-specialization`
  }
}
