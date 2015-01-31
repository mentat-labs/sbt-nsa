package com.mentatlabs.nsa
package scalac
package dsl
package experimental

class ScalacOptionsDSLExperimentalPrivateDeprecatedSpec extends ScalacOptionsDSLExperimentalSpec {
  def is = s2"""
  -Yeta-expand-keeps-star   ${`-Yeta-expand-keeps-star test`}
  -Yinfer-by-name           ${`-Yinfer-by-name test`}
  -Yinfer-debug             ${`-Yinfer-debug test`}
  -Ymacro-no-expand         ${`-Ymacro-no-expand test`}
"""

  def `-Yeta-expand-keeps-star test` = new CheckDSL { init (
    -Yeta-expand-keeps-star, "-Yeta-expand-keeps-star"
  )}

  def `-Yinfer-by-name test` = new CheckDSL { init (
    -Yinfer-by-name ,"-Yinfer-by-name"
  )}

  def `-Yinfer-debug test` = new CheckDSL { init (
    -Yinfer-debug, "-Yinfer-debug"
  )}

  def `-Ymacro-no-expand test` = new CheckDSL { init (
    -Ymacro-no-expand, "-Ymacro-no-expand"
  )}
}
