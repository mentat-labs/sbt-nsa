package hr.element.nsa
package experimental_dsl

trait YdebugDSL extends ExperimentalDSL {
  object Ydebug {
    val unary_- = `-Ydebug`
  }
}
