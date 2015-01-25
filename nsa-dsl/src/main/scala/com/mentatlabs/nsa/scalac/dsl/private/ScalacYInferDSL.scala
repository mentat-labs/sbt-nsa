package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYInferDSL
    extends ScalacOptionDSL {

  object Yinfer {
    val unary_- = `-Yinfer`
    object `-Yinfer` {
      def -(a: argument.type) = `-Yinfer-argument`
      object `-Yinfer-argument` {
        def -(t: types.type) = ScalacYInferArgumentTypes
      }

      def -(b: by.type) = `-Yinfer-by`
      object `-Yinfer-by` {
        def -(n: name.type) = ScalacYInferByName
      }

      def -(d: debug.type) = ScalacYInferDebug
    }
  }
}
