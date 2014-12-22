package com.mentatlabs.nsa

import experimental_dsl._

trait TypedScalacOptions
    extends ScalacOptions {

  implicit def Pimp1Param(p1: String) =
    new TypedOption {
      override def params: Seq[String] = Seq(p1)
      override def since: ScalacVersion = ScalacVersion.`2.0.0`
    }

  implicit def Pimp2Param(p12: Product2[String, String]) =
    new TypedOption {
      override def params: Seq[String] = Seq(p12._1, p12._2)
      override def since: ScalacVersion = ScalacVersion.`2.0.0`
    }

  def options: Seq[TypedOption]
}
