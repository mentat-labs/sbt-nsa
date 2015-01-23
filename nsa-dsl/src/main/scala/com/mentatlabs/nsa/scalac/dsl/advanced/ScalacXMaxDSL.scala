package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXMaxDSL extends ScalacDSL {
  object Xmax {
    val unary_- = `-Xmax`
    object `-Xmax` {
      def -(c: classfile.type) = `-Xmax-classfile`
      object `-Xmax-classfile` {
        def -(n: name.type) = ScalacXMaxClassfileName
      }
    }
  }
}
