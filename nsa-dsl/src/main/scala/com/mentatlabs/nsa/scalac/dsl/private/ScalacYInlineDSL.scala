package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYInlineDSL
    extends ScalacOptionDSL {

  object Yinline {
    val unary_- = ScalacYInline
  }

  implicit class PimpYinline(y: ScalacYInline.type) {
    def -(h: handlers.type) = ScalacYInlineHandlers
    def -(w: warnings.type) = ScalacYInlineWarnings
  }
}
