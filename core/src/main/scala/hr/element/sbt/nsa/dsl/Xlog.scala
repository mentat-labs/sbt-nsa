package hr.element.sbt.nsa
package dsl

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
      val - = (_: conversions.type) => `-Xlog-implicit-conversions`
    }

    // helper method instead of -Xlog-`implicit`-conversions
    def -(ic: implicit_conversions.type) = `-Xlog-implicit-conversions`

    def -(i: implicits.type) = `-Xlog-implicits`

    def -(r: reflective.type) = `-Xlog-reflective`
    object `-Xlog-reflective` {
      val - = (_: calls.type) => `-Xlog-reflective-calls`
    }
  }
}

// helper method instead of -Xlog-`implicit`
object Xlog_implicit {
  val unary_- = Xlog.`-Xlog`.`-Xlog-implicit`
}
