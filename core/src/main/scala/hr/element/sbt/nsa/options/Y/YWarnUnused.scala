package hr.element.sbt.nsa

case object `-Ywarn-unused` extends JustSetting {
  val - = (_: dsl.`import`.type) => `-Ywarn-unused-import`
}
