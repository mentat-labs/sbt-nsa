package hr.element.sbt.nsa
package dsl

object none { val :: = (_: `-g`.type) => `-g`.none }
object source { val :: = (_: `-g`.type) => `-g`.source }
object line { val :: = (_: `-g`.type) => `-g`.line }
object vars { val :: = (_: `-g`.type) => `-g`.vars }
object notailcalls { val :: = (_: `-g`.type) => `-g`.notailcalls }

object g {
  val unary_- = `-g`
}
