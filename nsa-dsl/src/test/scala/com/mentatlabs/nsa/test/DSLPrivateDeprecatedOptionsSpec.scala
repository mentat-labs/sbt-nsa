package com.mentatlabs.nsa.test

class DSLPrivateDeprecatedOptionsSpec extends DSLOptionsSpec {
  def is = s2"""
  -Yeta-expand-keeps-star   ${`-Yeta-expand-keeps-star test`}
  -Yinfer-by-name           ${`-Yinfer-by-name test`}
  -Yinfer-debug             ${`-Yinfer-debug test`}
  -Ymacro-no-expand         ${`-Ymacro-no-expand test`}
"""

  def `-Yeta-expand-keeps-star test` = new TypedScalacOptions { def options = Seq(
    -Yeta-expand-keeps-star, "-Yeta-expand-keeps-star"
  )}

  def `-Yinfer-by-name test` = new TypedScalacOptions { def options = Seq(
    -Yinfer-by-name ,"-Yinfer-by-name"
  )}

  def `-Yinfer-debug test` = new TypedScalacOptions { def options = Seq(
    -Yinfer-debug, "-Yinfer-debug"
  )}

  def `-Ymacro-no-expand test` = new TypedScalacOptions { def options = Seq(
    -Ymacro-no-expand, "-Ymacro-no-expand"
  )}
}
