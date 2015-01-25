package com.mentatlabs.nsa
package scalac
package dsl

import org.specs2._, specification.SpecPart

trait ScalacOptionsDSLSpec
    extends Specification {

  protected implicit def checkPairs(optionPairs: ScalacOptions): SpecPart = {
    val pairs = optionPairs.options.grouped(2).toList
    pairs map { pair => pair(0).params === pair(1).params }
  }
}
