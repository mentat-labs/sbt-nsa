package hr.element.nsa

import experimental_dsl._

trait TypedScalacOptions
    extends ScalacOptions {
  def settings: Seq[TypedOption]
}
