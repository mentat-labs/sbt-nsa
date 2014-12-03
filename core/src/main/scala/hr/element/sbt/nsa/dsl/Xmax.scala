package hr.element.sbt.nsa
package dsl

object classfile
object name

object Xmax {
  val unary_- = `-Xmax`
  object `-Xmax` {
    def -(c: classfile.type) = `-Xmax-classfile`
    object `-Xmax-classfile` {
      def -(n: name.type) = `-Xmax-classfile-name`
    }
  }
}
