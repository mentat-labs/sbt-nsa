package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYInferDSL
    extends ScalacExperimentalDSL {

  object Yinfer {
    val unary_- = new {
      def -(a: argument.type) = new {
        def -(t: types.type) = options.ScalacYInferArgumentTypes
      }

      def -(b: by.type) = new {
        def -(n: name.type) = options.ScalacYInferByName
      }

      def -(d: debug.type) = options.ScalacYInferDebug
    }
  }
}
