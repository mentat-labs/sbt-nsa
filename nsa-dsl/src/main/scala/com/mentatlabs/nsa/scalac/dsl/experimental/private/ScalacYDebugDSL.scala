package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYDebugDSL
    extends ScalacExperimentalDSL {

  object Ydebug {
    val unary_- = options.ScalacYDebug
  }
}
