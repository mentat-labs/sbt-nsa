package com.mentatlabs.nsa
package scalac
package options

/** -Yresolve-term-conflict:<strategy>
  * ==================================
  *    2.9.1 - 2.12.0: Resolve term conflicts (package,object,error) default:error
  */
object ScalacYResolveTermConflict
    extends ScalacOptionChoiceContainer("-Yresolve-term-conflict", `2.9.1`) {

  def `package` = apply("package")
  def `object` = apply("object")
  def error = apply("error")
}
