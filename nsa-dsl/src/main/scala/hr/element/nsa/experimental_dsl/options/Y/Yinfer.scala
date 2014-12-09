package hr.element.nsa
package experimental_dsl

trait YinferDSL extends ExperimentalDSL {
  object Yinfer {
    val unary_- = `-Yinfer`
    object `-Yinfer` {
      def -(b: by.type) = `-Yinfer-by`
      object `-Yinfer-by` {
        def -(n: name.type) = `-Yinfer-by-name`
      }

      def -(d: debug.type) = `-Yinfer-debug`
    }
  }
}
