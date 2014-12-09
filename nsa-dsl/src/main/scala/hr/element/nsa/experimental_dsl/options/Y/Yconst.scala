package hr.element.nsa
package experimental_dsl

trait YconstDSL extends ExperimentalDSL {
  object Yconst {
    val unary_- = `-Yconst`
    object `-Yconst` {
      def -(o: opt.type) = `-Yconst-opt`
    }
  }
}
