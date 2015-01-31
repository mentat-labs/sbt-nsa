package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYLogDSL
    extends ScalacExperimentalDSL {

  object Ylog {
    val unary_- = new {
      def -(c: classpath.type) = options.ScalacYLogClasspath
    }
  }
}
