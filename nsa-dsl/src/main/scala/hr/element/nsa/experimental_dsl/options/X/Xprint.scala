package hr.element.nsa
package experimental_dsl

trait XprintDSL extends ExperimentalDSL {
  object Xprint {
    val unary_- = `-Xprint`
    object `-Xprint` {
      def -(p: pos.type) = `-Xprint-pos`
      def -(t: types.type) = `-Xprint-types`
    }
  }
}
