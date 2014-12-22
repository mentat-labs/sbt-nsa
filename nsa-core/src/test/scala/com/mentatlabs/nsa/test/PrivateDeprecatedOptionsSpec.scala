package com.mentatlabs.nsa
package test

class PrivateDeprecatedOptionsSpec extends TypedOptionsSpec {
  def is = s2"""
  -Yeta-expand-keeps-star   ${`-Yeta-expand-keeps-star test`}   ${`-Yeta-expand-keeps-star`}
  -Yinfer-by-name           ${`-Yinfer-by-name test`}           ${`-Yinfer-by-name`}
  -Yinfer-debug             ${`-Yinfer-debug test`}             ${`-Yinfer-debug`}
  -Ymacro-no-expand         ${`-Ymacro-no-expand test`}         ${`-Ymacro-no-expand`}
"""

  def `-Yeta-expand-keeps-star test` =
    `-Yeta-expand-keeps-star` =>= "-Yeta-expand-keeps-star"

  def `-Yinfer-by-name test` =
    `-Yinfer-by-name` =>= "-Yinfer-by-name"

  def `-Yinfer-debug test` =
    `-Yinfer-debug` =>= "-Yinfer-debug"

  def `-Ymacro-no-expand test` =
    `-Ymacro-no-expand` =>= "-Ymacro-no-expand"
}
