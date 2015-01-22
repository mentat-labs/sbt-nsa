package com.mentatlabs.nsa
package scalac
package options

/** -Ymacro-expand:<policy>
  * =======================
  *   2.11.0 - 2.12.0: Control expansion of macros, useful for scaladoc and presentation compiler (normal,none,discard) default:normal
  */
object ScalacYMacroExpand
    extends ScalacOptionChoiceContainer("-Ymacro-expand", `2.11.0`) {

  def normal = apply("normal")
  def none = apply("none")
  def discard = apply("discard")
}
