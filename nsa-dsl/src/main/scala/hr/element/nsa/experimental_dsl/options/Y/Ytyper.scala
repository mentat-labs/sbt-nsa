package hr.element.nsa
package experimental_dsl

trait YtyperDSL extends ExperimentalDSL {
  object Ytyper {
    val unary_- = `-Ytyper`
    object `-Ytyper` {
      def -(d: debug.type) = `-Ytyper-debug`
    }
  }
}
