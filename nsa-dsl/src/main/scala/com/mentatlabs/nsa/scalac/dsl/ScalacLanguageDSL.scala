package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacLanguageDSL extends ScalacDSL {
  object language {
    val unary_- = ScalacLanguage
  }
}
