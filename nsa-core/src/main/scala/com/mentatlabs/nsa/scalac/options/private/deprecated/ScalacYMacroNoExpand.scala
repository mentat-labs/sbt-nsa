package com.mentatlabs.nsa
package scalac
package options

/* -Ymacro-no-expand
 * =================
 *   2.10.1 - 2.12.0: Don't expand macros. Might be useful for scaladoc and presentation compiler, but will crash anything which uses macros and gets past typer.
 */
case object ScalacYMacroNoExpand
    extends ScalacOptionBoolean("-Ymacro-no-expand", ScalacVersions.`2.10.1`) {
  override val deprecated = Some(ScalacVersions.`2.11.0`)
  override val removed = Some(ScalacVersions.`2.12.0`)
}
