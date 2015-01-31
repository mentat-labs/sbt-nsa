package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYWarnDSL
    extends ScalacExperimentalDSL {

  object Ywarn {
    val unary_- = new {
      def -(a: adapted.type) = new {
        def -(a: args.type) = options.ScalacYWarnAdaptedArgs
      }

      def -(d: dead.type) = new {
        def -(c: code.type) = options.ScalacYWarnDeadCode
      }

      def -(i: inaccessible.type) = options.ScalacYWarnInaccessible

      def -(i: infer.type) = new {
        def -(a: any.type) = options.ScalacYWarnInferAny
      }

      def -(n: nullary.type) = new {
        def -(o: `override`.type) = options.ScalacYWarnNullaryOverride
        def -(u: unit.type) = options.ScalacYWarnNullaryUnit
      }

      // helper method instead of -Ywarn-nullary-`override`
      def -(no: nullary_override.type) = options.ScalacYWarnNullaryOverride

      def -(n: numeric.type) = new {
        def -(w: widen.type) = options.ScalacYWarnNumericWiden
      }

      def -(u: unused.type) = options.ScalacYWarnUnused

      // helper method instead of -Ywarn-unused-`import`
      def -(u: unused_import.type) = options.ScalacYWarnUnusedImport

      def -(v: value.type) = new {
        def -(d: discard.type) = options.ScalacYWarnValueDiscard
      }
    }
  }

  implicit class PimpYwarnUnused(y: options.ScalacYWarnUnused.type) {
    def -(d: `import`.type) = options.ScalacYWarnUnusedImport
  }
}
