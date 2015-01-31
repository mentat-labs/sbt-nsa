package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYIssueDSL
    extends ScalacExperimentalDSL {

  object Yissue {
    val unary_- = new {
      def -(d: debug.type) = options.ScalacYIssueDebug
    }
  }
}
