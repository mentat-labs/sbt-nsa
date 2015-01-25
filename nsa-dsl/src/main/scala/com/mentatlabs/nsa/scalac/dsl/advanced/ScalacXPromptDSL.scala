package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXPromptDSL
    extends ScalacOptionDSL {

  object Xprompt {
    val unary_- = ScalacXPrompt
  }
}
