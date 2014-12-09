package hr.element.nsa
package experimental_dsl

trait YetaDSL extends ExperimentalDSL {
  object Yeta {
    val unary_- = `-Yeta`
    object `-Yeta` {
      def -(e: expand.type) = `-Yeta-expand`
      object `-Yeta-expand` {
        def -(k: keeps.type) = `-Yeta-expand-keeps`
        object `-Yeta-expand-keeps` {
          def -(s: star.type) = `-Yeta-expand-keeps-star`
        }
      }
    }
  }
}
