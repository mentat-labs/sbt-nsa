package hr.element.sbt.nsa
package dsl

object Xmax {
  val unary_- = `-Xmax`

  object `-Xmax` {
    val - = (_: classfile.type) => `-Xmax-classfile`

    object `-Xmax-classfile` {
      val - = (_: name.type) => `-Xmax-classfile-name`
    }
  }
}
