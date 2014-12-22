package com.mentatlabs.nsa
package test

class PrivateAdditionalOptionsSpec extends TypedOptionsSpec {
  def is = s2"""
  -Ydoc-debug            ${`-Ydoc-debug test`}            ${`-Ydoc-debug`}
  -Yide-debug            ${`-Yide-debug test`}            ${`-Yide-debug`}
  -Yissue-debug          ${`-Yissue-debug test`}          ${`-Yissue-debug`}
  -Ypatmat-debug         ${`-Ypatmat-debug test`}         ${`-Ypatmat-debug`}
  -Ypos-debug            ${`-Ypos-debug test`}            ${`-Ypos-debug`}
  -Ypresentation-debug   ${`-Ypresentation-debug test`}   ${`-Ypresentation-debug`}
  -Yquasiquote-debug     ${`-Yquasiquote-debug test`}     ${`-Yquasiquote-debug`}
  -Yreify-debug          ${`-Yreify-debug test`}          ${`-Yreify-debug`}
  -Ytyper-debug          ${`-Ytyper-debug test`}          ${`-Ytyper-debug`}
"""

  def `-Ydoc-debug test` =
    `-Ydoc-debug` =>= "-Ydoc-debug"

  def `-Yide-debug test` =
    `-Yide-debug` =>= "-Yide-debug"

  def `-Yissue-debug test` =
    `-Yissue-debug` =>= "-Yissue-debug"

  def `-Ypatmat-debug test` =
    `-Ypatmat-debug` =>= "-Ypatmat-debug"

  def `-Ypos-debug test` =
    `-Ypos-debug` =>= "-Ypos-debug"

  def `-Ypresentation-debug test` =
    `-Ypresentation-debug` =>= "-Ypresentation-debug"

  def `-Yquasiquote-debug test` =
    `-Yquasiquote-debug` =>= "-Yquasiquote-debug"

  def `-Yreify-debug test` =
    `-Yreify-debug` =>= "-Yreify-debug"

  def `-Ytyper-debug test` =
    `-Ytyper-debug` =>= "-Ytyper-debug"
}
