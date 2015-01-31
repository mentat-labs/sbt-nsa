package com.mentatlabs.nsa
package scalac
package dsl
package experimental

class ScalacOptionsDSLExperimentalPrivateAdditionalSpec extends ScalacOptionsDSLExperimentalSpec {
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

  def `-Ydoc-debug test` = new CheckDSL { init (
    -Ydoc-debug, "-Ydoc-debug"
  )}

  def `-Yide-debug test` = new CheckDSL { init (
    -Yide-debug, "-Yide-debug"
  )}

  def `-Yissue-debug test` = new CheckDSL { init (
    -Yissue-debug, "-Yissue-debug"
  )}

  def `-Ypatmat-debug test` = new CheckDSL { init (
    -Ypatmat-debug, "-Ypatmat-debug"
  )}

  def `-Ypos-debug test` = new CheckDSL { init (
    -Ypos-debug, "-Ypos-debug"
  )}

  def `-Ypresentation-debug test` = new CheckDSL { init (
    -Ypresentation-debug, "-Ypresentation-debug"
  )}

  def `-Yquasiquote-debug test` = new CheckDSL { init (
    -Yquasiquote-debug, "-Yquasiquote-debug"
  )}

  def `-Yreify-debug test` = new CheckDSL { init (
    -Yreify-debug, "-Yreify-debug"
  )}

  def `-Ytyper-debug test` = new CheckDSL { init (
    -Ytyper-debug, "-Ytyper-debug"
  )}
}
