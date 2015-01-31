package com.mentatlabs.nsa
package scalac
package options

/** -Yskip:<phases>
  * ==============
  *     2.6.0 - 2.7.7: Skip <phase>
  *     2.8.0 - 2.8.2: Skip <phase> or "all"
  *     2.9.0 - 2.9.3: Skip <phase>.
  *   2.10.0 - 2.12.0: Skip <phases>
  */
object ScalacYSkip
    extends ScalacOptionChoiceContainer[String]("-Yskip", ScalacVersions.`2.6.0`) {

  def typer = apply("typer")
  def patmat = apply("patmat")
  def erasure = apply("erasure")
  def cleanup = apply("cleanup")
  def jvm = apply("jvm")
}
