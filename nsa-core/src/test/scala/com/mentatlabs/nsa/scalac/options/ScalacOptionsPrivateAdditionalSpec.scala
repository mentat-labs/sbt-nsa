package com.mentatlabs.nsa
package scalac
package options

class ScalacOptionsPrivateAdditionalSpec extends ScalacOptionsSpec {
  def is = s2"""
  -Ydoc-debug            ${`-Ydoc-debug test`}            ${ScalacYDocDebug}
  -Yide-debug            ${`-Yide-debug test`}            ${ScalacYIdeDebug}
  -Yissue-debug          ${`-Yissue-debug test`}          ${ScalacYIssueDebug}
  -Ypatmat-debug         ${`-Ypatmat-debug test`}         ${ScalacYPatmatDebug}
  -Ypos-debug            ${`-Ypos-debug test`}            ${ScalacYPosDebug}
  -Ypresentation-debug   ${`-Ypresentation-debug test`}   ${ScalacYPresentationDebug}
  -Yquasiquote-debug     ${`-Yquasiquote-debug test`}     ${ScalacYQuasiquoteDebug}
  -Yreify-debug          ${`-Yreify-debug test`}          ${ScalacYReifyDebug}
  -Ytyper-debug          ${`-Ytyper-debug test`}          ${ScalacYTyperDebug}
"""

  def `-Ydoc-debug test` =
    ScalacYDocDebug =>= "-Ydoc-debug"

  def `-Yide-debug test` =
    ScalacYIdeDebug =>= "-Yide-debug"

  def `-Yissue-debug test` =
    ScalacYIssueDebug =>= "-Yissue-debug"

  def `-Ypatmat-debug test` =
    ScalacYPatmatDebug =>= "-Ypatmat-debug"

  def `-Ypos-debug test` =
    ScalacYPosDebug =>= "-Ypos-debug"

  def `-Ypresentation-debug test` =
    ScalacYPresentationDebug =>= "-Ypresentation-debug"

  def `-Yquasiquote-debug test` =
    ScalacYQuasiquoteDebug =>= "-Yquasiquote-debug"

  def `-Yreify-debug test` =
    ScalacYReifyDebug =>= "-Yreify-debug"

  def `-Ytyper-debug test` =
    ScalacYTyperDebug =>= "-Ytyper-debug"
}
