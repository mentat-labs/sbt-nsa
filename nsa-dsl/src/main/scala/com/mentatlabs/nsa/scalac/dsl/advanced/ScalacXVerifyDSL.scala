package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXVerifyDSL extends ScalacDSL {
  object Xverify {
    val unary_- = ScalacXVerify
  }
}
