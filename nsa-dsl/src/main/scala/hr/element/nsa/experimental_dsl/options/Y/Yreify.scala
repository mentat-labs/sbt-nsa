package hr.element.nsa
package experimental_dsl

trait YreifyDSL extends ExperimentalDSL {
  object Yreify {
    val unary_- = `-Yreify`
    object `-Yreify` {
      def -(d: debug.type) = `-Yreify-debug`
    }
  }
}
