package com.mentatlabs.nsa
package scalac
package dsl

class ScalacOptionsDSLPrivateDeprecatedSpec extends ScalacOptionsDSLSpec {
  def is = s2"""
  -Yeta-expand-keeps-star   ${`-Yeta-expand-keeps-star test`}
  -Yinfer-by-name           ${`-Yinfer-by-name test`}
  -Yinfer-debug             ${`-Yinfer-debug test`}
  -Ymacro-no-expand         ${`-Ymacro-no-expand test`}
"""

  def `-Yeta-expand-keeps-star test` = new ScalacOptions { def options = Seq(
    -Yeta-expand-keeps-star, "-Yeta-expand-keeps-star"
  )}

  def `-Yinfer-by-name test` = new ScalacOptions { def options = Seq(
    -Yinfer-by-name ,"-Yinfer-by-name"
  )}

  def `-Yinfer-debug test` = new ScalacOptions { def options = Seq(
    -Yinfer-debug, "-Yinfer-debug"
  )}

  def `-Ymacro-no-expand test` = new ScalacOptions { def options = Seq(
    -Ymacro-no-expand, "-Ymacro-no-expand"
  )}
}
