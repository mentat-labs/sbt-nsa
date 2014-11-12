package hr.element.sbt.nsa
package dsl

object Ywarn {
  val unary_- = `-Ywarn`
  object `-Ywarn` {
    def -(a: adapted.type) = `-Ywarn-adapted`
    object `-Ywarn-adapted` {
      val - = (_: args.type) => `-Ywarn-adapted-args`
    }

    def -(d: dead.type) = `-Ywarn-dead`
    object `-Ywarn-dead` {
      val - = (_: code.type) => `-Ywarn-dead-code`
    }

    def -(i: inaccessible.type) = `-Ywarn-inaccessible`

    def -(i: infer.type) = `-Ywarn-infer`
    object `-Ywarn-infer` {
      val - = (_: any.type) => `-Ywarn-infer-any`
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
      val - = (_: widen.type) => `-Ywarn-numeric-widen`
    }

    def -(u: unused.type) = `-Ywarn-unused`

    // helper method instead of -Ywarn-unused-`import`
    def -(u: unused_import.type) = `-Ywarn-unused-import`

    def -(v: value.type) = `-Ywarn-value`
    object `-Ywarn-value` {
      val - = (_: discard.type) => `-Ywarn-value-discard`
    }
  }
}