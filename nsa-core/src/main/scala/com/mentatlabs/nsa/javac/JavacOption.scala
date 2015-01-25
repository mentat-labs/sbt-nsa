package com.mentatlabs.nsa
package javac

sealed trait JavacOption
    extends CompilerOption

abstract class JavacOptionSwitch(val setting: String)
    extends CompilerOptionSwitch
    with JavacOption

abstract class JavacOptionValue[T](val setting: String, val value: T)
    extends CompilerOptionValue[T]
    with JavacOption

abstract class JavacOptionChoice[T](val setting: String, val values: T*)
    extends CompilerOptionChoice[T]
    with JavacOption
