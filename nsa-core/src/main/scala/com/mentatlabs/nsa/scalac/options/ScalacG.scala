package com.mentatlabs.nsa
package scalac
package options

/* -g:<level>
 * ==========
 *     2.0.0 - 2.1.7: Generate debugging info // previously -g
 *     2.1.8 - 2.5.1: Generate debugging info (none,source,line,vars,notc)
 *     2.6.0 - 2.7.0: Specify level of generated debugging info (none,source,line,vars,notc)
 *     2.7.1 - 2.8.2: Specify level of generated debugging info (none,source,line,vars,notailcalls)
 *    2.9.0 - 2.12.0: Set level of generated debugging info. (none,source,line,vars,notailcalls) default:vars
 */
object ScalacG
    extends ScalacOptionChoiceContainer[String]("-g", ScalacVersions.`2.0.0`) {

  def none = apply("none")
  def source = apply("source")
  def line = apply("line")
  def vars = apply("vars")
  def notailcalls = apply("notailcalls")
}
