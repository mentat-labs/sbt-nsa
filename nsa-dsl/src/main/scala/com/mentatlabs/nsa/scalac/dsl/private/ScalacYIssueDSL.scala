package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYIssueDSL
    extends ScalacOptionDSL {

  object Yissue {
    val unary_- = `-Yissue`
    object `-Yissue` {
      def -(d: debug.type) = ScalacYIssueDebug
    }
  }
}
