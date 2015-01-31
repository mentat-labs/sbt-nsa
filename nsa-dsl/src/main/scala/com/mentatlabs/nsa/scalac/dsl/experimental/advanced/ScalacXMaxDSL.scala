package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXMaxDSL
    extends ScalacExperimentalDSL {

  object Xmax {
    val unary_- = new {
      def -(c: classfile.type) = new {
        def -(n: name.type) = options.ScalacXMaxClassfileName
        def -(n: name.WithInt) = options.ScalacXMaxClassfileName(n.value)
      }
    }
  }
}
