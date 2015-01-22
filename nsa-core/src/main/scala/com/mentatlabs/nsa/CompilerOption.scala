package com.mentatlabs.nsa

/** Base trait for all compiler options */
trait CompilerOption {
  def params: Seq[String]
  override def toString = params mkString " "
}

/** Noop compiler option */
object CompilerOption {
  object Empty extends CompilerOption {
    def params = Seq.empty
  }
}

/** Single compiler option (switch) */
trait CompilerOptionSwitch
    extends CompilerOption {
  def setting: String
  def params = Seq(setting)
}

/** Compiler option pair */
trait CompilerOptionValue[T]
    extends CompilerOption {
  def setting: String
  def value: T
  def params = Seq(setting, value.toString)
}

/** Compiler option with a name followed by concatenated choices */
trait CompilerOptionChoice
    extends CompilerOption {
  def setting: String
  def values: Seq[String]
  def params = Seq(setting + (values match {
    case x if x.isEmpty => ""
    case x => x.mkString(":", ",", "")
  }))
}
