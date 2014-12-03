package hr.element.sbt.nsa
package dsl

object adapted
object args

object dead
object code

object inaccessible

object infer
object any

object nullary
object unit
object nullary_override
object `override`

object numeric
object widen

object unused
object unused_import
object `import`

object discard
object value

object Ywarn {
  val unary_- = `-Ywarn`
  object `-Ywarn` {
    def -(a: adapted.type) = `-Ywarn-adapted`
    object `-Ywarn-adapted` {
      def -(a: args.type) = `-Ywarn-adapted-args`
    }

    def -(d: dead.type) = `-Ywarn-dead`
    object `-Ywarn-dead` {
      def -(c: code.type) = `-Ywarn-dead-code`
    }

    def -(i: inaccessible.type) = `-Ywarn-inaccessible`

    def -(i: infer.type) = `-Ywarn-infer`
    object `-Ywarn-infer` {
      def -(a: any.type) = `-Ywarn-infer-any`
    }

    def -(n: nullary.type) = `-Ywarn-nullary`
    object `-Ywarn-nullary` {
      def -(o: `override`.type) = `-Ywarn-nullary-override`
      def -(u: unit.type) = `-Ywarn-nullary-unit`
    }

    // helper method instead of -Ywarn-nullary-`override`
    def -(no: nullary_override.type) = `-Ywarn-nullary-override`

    def -(n: numeric.type) = `-Ywarn-numeric`
    object `-Ywarn-numeric` {
      def -(w: widen.type) = `-Ywarn-numeric-widen`
    }

    def -(u: unused.type) = `-Ywarn-unused`

    // helper method instead of -Ywarn-unused-`import`
    def -(u: unused_import.type) = `-Ywarn-unused-import`

    def -(v: value.type) = `-Ywarn-value`
    object `-Ywarn-value` {
      def -(d: discard.type) = `-Ywarn-value-discard`
    }
  }
}

trait YwarnUnusedPimps {
  implicit class PimpYwarnUnused(y: `-Ywarn-unused`.type) {
    def -(d: dsl.`import`.type) = `-Ywarn-unused-import`
  }
}
