package com.mentatlabs.nsa
package scalac
package dsl
package experimental

import java.nio.charset.Charset

trait ScalacEncodingDSL
    extends ScalacExperimentalDSL {

  object encoding {
    val unary_- = options.ScalacEncoding

    def apply(encoding: String) = new {
      def unary_- = options.ScalacEncoding(encoding)
    }

    def apply(encoding: Charset) = new {
      def unary_- = options.ScalacEncoding(encoding)
    }
  }
}
