package hr.element.nsa
package experimental_dsl

trait YpresentationDSL extends ExperimentalDSL {
  object Ypresentation {
    val unary_- = `-Ypresentation`
    object `-Ypresentation` {
      def -(d: debug.type) = `-Ypresentation-debug`
    }
  }
}
