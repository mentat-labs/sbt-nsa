package hr.element.nsa
package experimental_dsl

trait YpatmatDSL extends ExperimentalDSL {
  object Ypatmat {
    val unary_- = `-Ypatmat`
    object `-Ypatmat` {
      def -(d: debug.type) = `-Ypatmat-debug`
    }
  }
}
