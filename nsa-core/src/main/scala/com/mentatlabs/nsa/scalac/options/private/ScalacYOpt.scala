package com.mentatlabs.nsa
package scalac
package options

/* -Yopt:<_,optimization,-optimization>
 * ====================================
 *   2.11.3 - 2.12.0: Enable optimizations: `_' for all, `-Yopt:help' to list
 */
object ScalacYOpt
    extends ScalacOptionChoiceContainer[String]("-Yopt", ScalacVersions.`2.11.3`) {

  def `_` = apply("_")
  def help = apply("help")

  def `unreachable-code` = apply("unreachable-code")
  def `-unreachable-code` = apply("-unreachable-code")

  def `l:none` = apply("l:none")
  def `-l:none` = apply("-l:none")

  def `l:default` = apply("l:default")
  def `l:method` = apply("l:method")
  def `l:project` = apply("l:project")
  def `l:classpath` = apply("l:classpath")
}
