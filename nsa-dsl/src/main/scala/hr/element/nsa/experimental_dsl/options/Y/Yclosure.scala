package hr.element.nsa
package experimental_dsl

trait YclosureDSL extends ExperimentalDSL {
  object Yclosure {
    val unary_- = `-Yclosure`
    object `-Yclosure` {
      def -(e: elim.type) = `-Yclosure-elim`
    }
  }
}
