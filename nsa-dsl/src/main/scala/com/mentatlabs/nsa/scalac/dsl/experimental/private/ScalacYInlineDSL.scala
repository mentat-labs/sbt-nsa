package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYInlineDSL
    extends ScalacExperimentalDSL {

  object Yinline {
    val unary_- = options.ScalacYInline
  }

  implicit class PimpYinline(y: options.ScalacYInline.type) {
    def -(h: handlers.type) = options.ScalacYInlineHandlers
    def -(w: warnings.type) = options.ScalacYInlineWarnings
  }
}
