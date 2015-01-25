package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXNoDSL
    extends ScalacOptionDSL {

  object Xno {
    val unary_- = `-Xno`
    object `-Xno` {
      def -(f: forwarders.type) = ScalacXNoForwarders

      def -(p: patmat.type) = `-Xno-patmat`
      object `-Xno-patmat` {
        def -(a: analysis.type) = ScalacXNoPatmatAnalysis
      }

      def -(u: uescape.type) = ScalacXNoUescape
    }
  }
}
