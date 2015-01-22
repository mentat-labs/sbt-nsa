package com.mentatlabs.nsa

/** Shared options can be injected into either javac or scalac compiler options */
trait CompilerOptionContainer[T] {
  type CompilerOptionType <: CompilerOption
  def apply(value: T): CompilerOptionType
}
