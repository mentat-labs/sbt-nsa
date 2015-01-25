package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYLogDSL
    extends ScalacOptionDSL {

  object Ylog {
    val unary_- = `-Ylog`
    object `-Ylog` {
      def -(c: classpath.type) = ScalacYLogClasspath
    }
  }
}
