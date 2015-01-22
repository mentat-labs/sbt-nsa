package com.mentatlabs.nsa
package scalac
package options

/** -Ystop-after:<phases>
  * ====================
  *     2.9.0 - 2.9.3: Stop after given phase <phase>.
  *   2.10.0 - 2.12.0: Stop after <phases>
  */
object ScalacYStopAfter
    extends ScalacOptionChoiceContainer("-Ystop-after", `2.9.0`) {

  def parser = apply("parser")
  def typer = apply("typer")
  def patmat = apply("patmat")
  def erasure = apply("erasure")
  def cleanup = apply("cleanup")
  def jvm = apply("jvm")
}
