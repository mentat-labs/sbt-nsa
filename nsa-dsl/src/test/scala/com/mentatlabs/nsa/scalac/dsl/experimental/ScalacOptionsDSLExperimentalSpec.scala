package com.mentatlabs.nsa
package scalac
package dsl
package experimental

import org.specs2._, specification.SpecPart

trait ScalacOptionsDSLExperimentalSpec
    extends Specification {

  protected implicit def CheckToSpec(check: CheckDSL): SpecPart = {
    check.checks match {
      case Some(checks) =>
        for {
          pair <- checks.grouped(2).toSeq
          (expected, actual) <- pair(1).params.zipAll(pair(0).params, "", "")
        } yield expected === actual

      case _ =>
        pending
    }
  }

  class CheckDSL
      extends ScalacOptionsExperimentalDSL {

    protected implicit def PimpString(s: String) =
      new CompilerOption {
        def params = Seq(s)
      }

    protected implicit def PimpProduct(p: Product) =
      new CompilerOption {
        def params = p.productIterator.map(_.toString).toSeq
      }

    var checks: Option[Seq[CompilerOption]] = None
    protected def init(optionPairs: CompilerOption*) =
      checks = Some(optionPairs)
  }
}
