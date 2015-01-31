package com.mentatlabs.nsa
package scalac
package options

/** -Ymacro-no-expand
  * =================
  *   2.10.1 - 2.12.0: Don't expand macros. Might be useful for scaladoc and presentation compiler, but will crash anything which uses macros and gets past typer.
  *                      deprecated: Use -Ymacro-expand:none
  */
case object ScalacYMacroNoExpand
    extends ScalacOptionSwitch("-Ymacro-no-expand") {
  val since = ScalacVersions.`2.10.1`
  override val deprecated = Some(ScalacVersions.`2.11.0`)
}
