package hr.element.nsa
package experimental_dsl

trait YdeadDSL extends ExperimentalDSL {
  object Ydead {
    val unary_- = `-Ydead`
    object `-Ydead` {
      def -(c: code.type) = `-Ydead-code`
    }
  }
}
