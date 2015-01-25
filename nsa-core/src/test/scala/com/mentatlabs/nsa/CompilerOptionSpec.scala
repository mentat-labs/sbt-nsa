package com.mentatlabs.nsa

import org.specs2._

class CompilerOptionSpec extends Specification {
  def is = s2"""
  compiler option         ${compilerOption}
  compiler option empty   ${compilerOptionEmpty}
  compiler switch         ${compilerSwitch}
  compiler value (String) ${compilerValueString}
  compiler value (Int)    ${compilerValueInt}
  compiler choice (0)     ${compilerChoiceZero}
  compiler choice (empty) ${compilerChoiceEmpty}
  compiler choice (1)     ${compilerChoiceOne}
  compiler choice (3)     ${compilerChoiceMultiple}
"""

  def compilerOption = {
    val option = new CompilerOption {
      def params = Seq("-option", "setting")
    }

    option.params === Seq("-option", "setting") and
      option.toString === "-option setting"
  }

  def compilerOptionEmpty = {
    val option = CompilerOption.Empty

    option.params === Seq.empty and
    option.toString === ""
  }

  def compilerSwitch = {
    val option = new CompilerOptionSwitch {
      def setting = "-switch"
    }

    option.params === Seq("-switch") and
    option.toString === "-switch"
  }

  def compilerValueString = {
    val option = new CompilerOptionValue[String] {
      def setting = "-value"
      def value = "foo"
    }

    option.params === Seq("-value", "foo") and
    option.toString === "-value foo"
  }

  def compilerValueInt = {
    val option = new CompilerOptionValue[Int] {
      def setting = "-value"
      def value = -32
    }

    option.params === Seq("-value", "-32") and
    option.toString === "-value -32"
  }

  def compilerChoiceZero = {
    val option = new CompilerOptionChoice[String] {
      def setting = "-choice"
      def values = Seq.empty
    }

    option.params === Seq("-choice") and
    option.toString === "-choice"
  }

  def compilerChoiceEmpty = {
    val option = new CompilerOptionChoice[String] {
      def setting = "-choice"
      def values = Seq("")
    }

    option.params === Seq("-choice:") and
    option.toString === "-choice:"
  }

  def compilerChoiceOne = {
    val option = new CompilerOptionChoice[String] {
      def setting = "-choice"
      def values = Seq("foo")
    }

    option.params === Seq("-choice:foo") and
    option.toString === "-choice:foo"
  }

  def compilerChoiceMultiple = {
    val option = new CompilerOptionChoice[String] {
      def setting = "-choice"
      def values = Seq("foo", "bar", "baz")
    }

    option.params === Seq("-choice:foo,bar,baz") and
    option.toString === "-choice:foo,bar,baz"
  }
}
