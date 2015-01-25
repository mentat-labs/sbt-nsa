package com.mentatlabs.nsa
package scalac
package options

/** -Ystop-before:<phases>
  * =====================
  *     2.9.0 - 2.9.3: Stop before given phase <phase>.
  *   2.10.0 - 2.12.0: Stop before <phases>
  */
object ScalacYStopBefore
    extends ScalacOptionChoiceContainer[String]("-Ystop-before", `2.9.0`) {

  def typer = apply("typer")
  def patmat = apply("patmat")
  def erasure = apply("erasure")
  def cleanup = apply("cleanup")
  def jvm = apply("jvm")
}
