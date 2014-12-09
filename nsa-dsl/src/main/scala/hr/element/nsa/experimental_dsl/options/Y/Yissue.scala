package hr.element.nsa
package experimental_dsl

trait YissueDSL extends ExperimentalDSL {
  object Yissue {
    val unary_- = `-Yissue`
    object `-Yissue` {
      def -(d: debug.type) = `-Yissue-debug`
    }
  }
}
