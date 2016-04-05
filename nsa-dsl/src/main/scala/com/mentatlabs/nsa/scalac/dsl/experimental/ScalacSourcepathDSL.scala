package com.mentatlabs.nsa
package scalac
package dsl
package experimental

import java.io.File

trait ScalacSourcepathDSL
    extends ScalacExperimentalDSL {

  object sourcepath {
    def apply(path: File) = new {
      def unary_- = options.ScalacSourcepath(path)
    }

    def apply(path: String) = new {
      def unary_- = options.ScalacSourcepath(path)
    }
  }
}
