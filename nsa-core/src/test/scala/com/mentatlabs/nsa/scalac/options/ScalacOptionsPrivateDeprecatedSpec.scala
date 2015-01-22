package com.mentatlabs.nsa
package scalac
package options

class ScalacOptionsPrivateDeprecatedSpec extends ScalacOptionsSpec {
  def is = s2"""
  -Yeta-expand-keeps-star   ${`-Yeta-expand-keeps-star test`}   ${ScalacYEtaExpandKeepsStar}
  -Yinfer-by-name           ${`-Yinfer-by-name test`}           ${ScalacYInferByName}
  -Yinfer-debug             ${`-Yinfer-debug test`}             ${ScalacYInferDebug}
  -Ymacro-no-expand         ${`-Ymacro-no-expand test`}         ${ScalacYMacroNoExpand}
"""

  def `-Yeta-expand-keeps-star test` =
    ScalacYEtaExpandKeepsStar =>= "-Yeta-expand-keeps-star"

  def `-Yinfer-by-name test` =
    ScalacYInferByName =>= "-Yinfer-by-name"

  def `-Yinfer-debug test` =
    ScalacYInferDebug =>= "-Yinfer-debug"

  def `-Ymacro-no-expand test` =
    ScalacYMacroNoExpand =>= "-Ymacro-no-expand"
}
