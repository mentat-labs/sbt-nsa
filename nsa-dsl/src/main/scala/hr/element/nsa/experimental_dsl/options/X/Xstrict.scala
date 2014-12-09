package hr.element.nsa
package experimental_dsl

trait XstrictDSL extends ExperimentalDSL {
  object Xstrict {
    val unary_- = `-Xstrict`
    object `-Xstrict` {
      def -(i: inference.type) = `-Xstrict-inference`
    }
  }
}
