package com.mentatlabs.nsa.test

import org.specs2._, specification.SpecPart

trait DSLOptionsSpec extends Specification {
  type TypedScalacOptions = com.mentatlabs.nsa.TypedScalacOptions

  protected implicit def checkPairs(optionPairs: TypedScalacOptions): SpecPart = {
    val pairs = optionPairs.options.grouped(2).toList
    pairs map { pair => pair(0).params === pair(1).params }
  }
}
