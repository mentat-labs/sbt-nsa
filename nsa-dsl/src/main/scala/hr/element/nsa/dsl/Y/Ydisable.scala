package hr.element.nsa
package dsl

object unreachable
object prevention

object Ydisable {
  val unary_- = `-Ydisable`
  object `-Ydisable` {
    def -(u: unreachable.type) = `-Ydisable-unreachable`
    object `-Ydisable-unreachable` {
      def -(p: prevention.type) = `-Ydisable-unreachable-prevention`
    }
  }
}
