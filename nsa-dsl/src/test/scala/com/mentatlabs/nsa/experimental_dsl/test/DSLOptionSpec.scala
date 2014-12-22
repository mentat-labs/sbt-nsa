package com.mentatlabs.nsa
package experimental_dsl
package test

import org.specs2._, specification.SpecPart

trait DSLOptionSpec extends Specification {
  protected implicit def checkPairs(optionPairs: TypedScalacOptions): SpecPart = {
    val pairs = optionPairs.options.grouped(2).toList
    pairs map { pair => pair(0).params === pair(1).params }
  }
}
