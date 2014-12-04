package hr.element.nsa
package dsl

object handlers
object warnings

object Yinline {
  val unary_- = `-Yinline`
}

trait YinlinePimps {
  implicit class PimpYinline(y: `-Yinline`.type) {
    def -(h: dsl.handlers.type) = `-Yinline-handlers`
    def -(w: dsl.warnings.type) = `-Yinline-warnings`
  }
}
