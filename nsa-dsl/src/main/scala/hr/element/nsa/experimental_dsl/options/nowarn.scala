package hr.element.nsa
package experimental_dsl

trait NowarnDSL extends ExperimentalDSL {
  object nowarn {
    val unary_- = `-nowarn`
  }
}
