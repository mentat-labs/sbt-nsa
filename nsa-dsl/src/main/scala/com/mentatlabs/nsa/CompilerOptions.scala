package com.mentatlabs.nsa

trait CompilerOptions {
  implicit def PimpString(s: String) =
    new CompilerOption {
      def params = Seq(s)
    }

  implicit def PimpProduct(p: Product) =
    new CompilerOption {
      def params = p.productIterator.map(_.toString).toSeq
    }

  def options: Seq[CompilerOption]
}
