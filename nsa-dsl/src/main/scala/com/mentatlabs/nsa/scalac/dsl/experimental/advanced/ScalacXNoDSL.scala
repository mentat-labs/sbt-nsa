package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacXNoDSL
    extends ScalacExperimentalDSL {

  object Xno {
    val unary_- = new {
      def -(f: forwarders.type) = options.ScalacXNoForwarders

      def -(p: patmat.type) = new {
        def -(a: analysis.type) = options.ScalacXNoPatmatAnalysis
      }

      def -(u: uescape.type) = options.ScalacXNoUescape
    }
  }
}
