package com.mentatlabs.nsa
package javac

case class JavacVersion(
    epoch: Int
  , major: Int) extends Ordered[JavacVersion] {

  def compare(that: JavacVersion) = {
    val epochDelta = epoch - that.epoch
    if (epochDelta != 0) {
      epochDelta
    }
    else {
      major - that.major
    }
  }

  override val toString = epoch + "." + major
}

object JavacVersion extends JavacVersions {
  private val JavacVersionPattern = """(\d+?)\.(\d+?)""" r

  def apply(javacVersion: String): Option[JavacVersion] = util.Try {
    val JavacVersionPattern(epochStr, majorStr) = javacVersion

    JavacVersion(
      epoch = epochStr.toInt
    , major = majorStr.toInt
    )
  }.toOption
}
