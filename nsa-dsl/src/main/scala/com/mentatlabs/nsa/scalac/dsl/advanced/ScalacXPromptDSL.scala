package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacXPromptDSL extends ScalacDSL {
  object Xprompt {
    val unary_- = ScalacXPrompt
  }
}
