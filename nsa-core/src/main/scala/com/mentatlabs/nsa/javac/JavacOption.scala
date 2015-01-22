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

abstract class JavacOptionChoice(val setting: String, val values: String*)
    extends CompilerOptionChoice
    with JavacOption
