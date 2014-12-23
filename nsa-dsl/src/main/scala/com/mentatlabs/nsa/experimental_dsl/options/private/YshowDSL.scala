package com.mentatlabs.nsa
package experimental_dsl

trait YshowDSL extends ExperimentalDSL {
  object Yshow {
    val unary_- = `-Yshow`
    object `-Yshow` {
      def -(s: symkinds.type) = `-Yshow-symkinds`
      def -(s: symowners.type) = `-Yshow-symowners`
      def -(s: syms.type) = `-Yshow-syms`

      def -(t: trees.type) = `-Yshow-trees`
    }
  }

  implicit class PimpYshowTrees(y: `-Yshow-trees`.type) {
    def -(c: compact.type) = `-Yshow-trees-compact`
    def -(s: stringified.type) = `-Yshow-trees-stringified`
  }
}
