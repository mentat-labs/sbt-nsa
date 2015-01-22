package com.mentatlabs.nsa
package javac

trait JavacOptionContainer[T]
    extends CompilerOptionContainer[T] {
  type CompilerOptionType = JavacOption
}

class JavacOptionValueContainer[T](
    protected val setting: String
  ) extends JavacOptionContainer[T] {

  def apply(value: T) =
    new JavacOptionValue(setting, value) {}
}
