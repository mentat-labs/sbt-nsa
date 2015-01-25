package com.mentatlabs.nsa
package scalac
package dsl

import java.nio.charset.Charset

import options._

trait ScalacEncodingDSL
    extends ScalacOptionDSL {

  object encoding {
    val unary_- = ScalacEncoding

    def apply(encoding: String) = new {
      def unary_- = ScalacEncoding(encoding)
    }

    def apply(encoding: Charset) = new {
      def unary_- = ScalacEncoding(encoding)
    }
  }
}
