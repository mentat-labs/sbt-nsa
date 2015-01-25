package com.mentatlabs.nsa
package scalac
package options

/** -Ystatistics:<_,phase,-phase>
  * ============
  *     2.6.0 - 2.8.2: Print compiler statistics
  *    2.9.0 - 2.11.2: Print compiler statistics.
  *   2.11.3 - 2.12.0: Print compiler statistics for specific phases: `_' for all, `-Ystatistics:help' to list
  */
object ScalacYStatistics
    extends ScalacOptionChoiceContainer[String]("-Ystatistics", `2.6.0`) {

  def `_` = apply("_")
  def help = apply("help")

  def parser = apply("parser")
  def `-parser` = apply("-parser")

  def typer = apply("typer")
  def `-typer` = apply("-typer")

  def patmat = apply("patmat")
  def `-patmat` = apply("-patmat")

  def erasure = apply("erasure")
  def `-erasure` = apply("-erasure")

  def cleanup = apply("cleanup")
  def `-cleanup` = apply("-cleanup")

  def jvm = apply("jvm")
  def `-jvm` = apply("-jvm")
}
