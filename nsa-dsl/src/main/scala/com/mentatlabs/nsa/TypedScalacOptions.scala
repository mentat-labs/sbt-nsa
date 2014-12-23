package com.mentatlabs.nsa

import experimental_dsl._

trait TypedScalacOptions
    extends ScalacOptions {

  implicit def PimpString(s: String) =
    new TypedOption {
      override def params: Seq[String] = Seq(s)
      override def since: ScalacVersion = ScalacVersion.`2.0.0`
    }

  implicit def PimpProduct(p: Product) =
    new TypedOption {
      override def params: Seq[String] = p.productIterator.map(_.toString).toSeq
      override def since: ScalacVersion = ScalacVersion.`2.0.0`
    }

  def options: Seq[TypedOption]
}
