package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYDebugDSL
    extends ScalacOptionDSL {

  object Ydebug {
    val unary_- = ScalacYDebug
  }
}