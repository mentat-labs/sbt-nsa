package com.mentatlabs.nsa

/** Don't expand macros. Might be useful for scaladoc and presentation compiler, but will crash anything which uses macros and gets past typer. */
case object `-Ymacro-no-expand` extends JustOption {
  val since = ScalacVersion.`2.10.1`
  override val deprecated = Some(ScalacVersion.`2.11.0`)
}
