package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYWarnDSL extends ScalacDSL {
  object Ywarn {
    val unary_- = `-Ywarn`
    object `-Ywarn` {
      def -(a: adapted.type) = `-Ywarn-adapted`
      object `-Ywarn-adapted` {
        def -(a: args.type) = ScalacYWarnAdaptedArgs
      }

      def -(d: dead.type) = `-Ywarn-dead`
      object `-Ywarn-dead` {
        def -(c: code.type) = ScalacYWarnDeadCode
      }

      def -(i: inaccessible.type) = ScalacYWarnInaccessible

      def -(i: infer.type) = `-Ywarn-infer`
      object `-Ywarn-infer` {
        def -(a: any.type) = ScalacYWarnInferAny
      }

      def -(n: nullary.type) = `-Ywarn-nullary`
      object `-Ywarn-nullary` {
        def -(o: `override`.type) = ScalacYWarnNullaryOverride
        def -(u: unit.type) = ScalacYWarnNullaryUnit
      }

      // helper method instead of -Ywarn-nullary-`override`
      def -(no: nullary_override.type) = ScalacYWarnNullaryOverride

      def -(n: numeric.type) = `-Ywarn-numeric`
      object `-Ywarn-numeric` {
        def -(w: widen.type) = ScalacYWarnNumericWiden
      }

      def -(u: unused.type) = ScalacYWarnUnused

      // helper method instead of -Ywarn-unused-`import`
      def -(u: unused_import.type) = ScalacYWarnUnusedImport

      def -(v: value.type) = `-Ywarn-value`
      object `-Ywarn-value` {
        def -(d: discard.type) = ScalacYWarnValueDiscard
      }
    }
  }

  implicit class PimpYwarnUnused(y: ScalacYWarnUnused.type) {
    def -(d: `import`.type) = ScalacYWarnUnusedImport
  }
}
