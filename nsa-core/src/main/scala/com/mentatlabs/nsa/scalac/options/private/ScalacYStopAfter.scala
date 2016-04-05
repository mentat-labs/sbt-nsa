package com.mentatlabs.nsa
package scalac
package options

/* -Ystop-after:<phases>
 * =====================
 *     2.0.0 - 2.1.0: Stop after phase <phases> (see below) // previously -stop:<phase>
 *     2.1.1 - 2.5.1: Stop after phase <phase> // previously -stop:<phase>
 *     2.6.0 - 2.7.7: Stop after phase <phase> // previously -Ystop:<phase>
 *     2.8.0 - 2.8.2: Stop after phase <phase> or "all" // previously -Ystop:<phase>
 *     2.9.0 - 2.9.3: Stop after given phase <phase>. // previously -Ystop-after:<phase>
 *   2.10.0 - 2.12.0: Stop after <phases>
 */
object ScalacYStopAfter
    extends ScalacOptionChoiceContainer[String]("-Ystop-after", ScalacVersions.`2.9.0`) {

  def parser = apply("parser")
  def typer = apply("typer")
  def patmat = apply("patmat")
  def erasure = apply("erasure")
  def cleanup = apply("cleanup")
  def jvm = apply("jvm")
}
