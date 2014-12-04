package hr.element.nsa
package dsl

object free
object terms
object types

object `implicit`
object conversions
object implicit_conversions
object implicits

object reflective
object calls

object Xlog {
  val unary_- = `-Xlog`
  object `-Xlog` {
    def -(f: free.type) = `-Xlog-free`
    object `-Xlog-free` {
      def -(t: terms.type) = `-Xlog-free-terms`
      def -(t: types.type) = `-Xlog-free-types`
    }

    def -(i: `implicit`.type) = `-Xlog-implicit`
    object `-Xlog-implicit` {
      def -(c: conversions.type) = `-Xlog-implicit-conversions`
    }

    // helper method instead of -Xlog-`implicit`-conversions
    def -(ic: implicit_conversions.type) = `-Xlog-implicit-conversions`

    def -(i: implicits.type) = `-Xlog-implicits`

    def -(r: reflective.type) = `-Xlog-reflective`
    object `-Xlog-reflective` {
      def -(c: calls.type) = `-Xlog-reflective-calls`
    }
  }
}

// helper method instead of -Xlog-`implicit`
object Xlog_implicit {
  val unary_- = Xlog.`-Xlog`.`-Xlog-implicit`
}
