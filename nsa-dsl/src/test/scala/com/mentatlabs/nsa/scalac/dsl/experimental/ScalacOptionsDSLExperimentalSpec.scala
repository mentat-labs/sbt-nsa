package com.mentatlabs.nsa
package scalac
package dsl
package experimental

import org.specs2._, specification.SpecPart
import scala.collection.mutable.ArrayBuffer

trait ScalacOptionsDSLExperimentalSpec
    extends Specification {

  protected implicit def CheckToSpec(check: CheckDSL): SpecPart =
    if (check.isEmpty) {
      pending
    }
    else {
      for {
        first :: second :: Nil <- check.grouped(2).toList
        (expected, actual) <- second.params.zipAll(first.params, "", "")
      } yield expected === actual
    }

  class CheckDSL
      extends ScalacOptionsExperimentalDSL
      with Iterable[CompilerOption] {

    private val checks = new ArrayBuffer[CompilerOption]
    protected def init(optionPairs: CompilerOption*) =
      checks ++= optionPairs

    protected implicit def PimpString(s: String) =
      new CompilerOption {
        def params = Seq(s)
      }

    protected implicit def PimpProduct(p: Product) =
      new CompilerOption {
        def params = p.productIterator.map(_.toString).toSeq
      }

    def iterator = checks.iterator
  }
}
