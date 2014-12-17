package com.mentatlabs.nsa
package experimental_dsl

trait XmaxDSL extends ExperimentalDSL {
  object Xmax {
    val unary_- = `-Xmax`
    object `-Xmax` {
      def -(c: classfile.type) = `-Xmax-classfile`
      object `-Xmax-classfile` {
        def -(n: name.type) = `-Xmax-classfile-name`
      }
    }
  }
}
