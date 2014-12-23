package com.mentatlabs.nsa.test

class DSLPrivateAdditionalOptionsSpec extends DSLOptionsSpec {
  def is = s2"""
  -Ydoc-debug            ${`-Ydoc-debug test`}
  -Yide-debug            ${`-Yide-debug test`}
  -Yissue-debug          ${`-Yissue-debug test`}
  -Ypatmat-debug         ${`-Ypatmat-debug test`}
  -Ypos-debug            ${`-Ypos-debug test`}
  -Ypresentation-debug   ${`-Ypresentation-debug test`}
  -Yquasiquote-debug     ${`-Yquasiquote-debug test`}
  -Yreify-debug          ${`-Yreify-debug test`}
  -Ytyper-debug          ${`-Ytyper-debug test`}
"""

  def `-Ydoc-debug test` = new TypedScalacOptions { def options = Seq(
    -Ydoc-debug, "-Ydoc-debug"
  )}

  def `-Yide-debug test` = new TypedScalacOptions { def options = Seq(
    -Yide-debug, "-Yide-debug"
  )}

  def `-Yissue-debug test` = new TypedScalacOptions { def options = Seq(
    -Yissue-debug, "-Yissue-debug"
  )}

  def `-Ypatmat-debug test` = new TypedScalacOptions { def options = Seq(
    -Ypatmat-debug, "-Ypatmat-debug"
  )}

  def `-Ypos-debug test` = new TypedScalacOptions { def options = Seq(
    -Ypos-debug, "-Ypos-debug"
  )}

  def `-Ypresentation-debug test` = new TypedScalacOptions { def options = Seq(
    -Ypresentation-debug, "-Ypresentation-debug"
  )}

  def `-Yquasiquote-debug test` = new TypedScalacOptions { def options = Seq(
    -Yquasiquote-debug, "-Yquasiquote-debug"
  )}

  def `-Yreify-debug test` = new TypedScalacOptions { def options = Seq(
    -Yreify-debug, "-Yreify-debug"
  )}

  def `-Ytyper-debug test` = new TypedScalacOptions { def options = Seq(
    -Ytyper-debug, "-Ytyper-debug"
  )}
}
