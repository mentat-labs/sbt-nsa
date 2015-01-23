package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacGDSL extends ScalacDSL {
  object g {
    val unary_- = ScalacG
  }
}
