package hr.element.nsa

case object `-Ymacro-no-expand` extends JustOption {
  override val since = ScalacVersion.`2.10.1`
  override val deprecated = Some(ScalacVersion.`2.11.0`)
}
