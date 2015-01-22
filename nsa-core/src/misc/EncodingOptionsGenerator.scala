package com.mentatlabs.nsa
package shared

object EncodingOptionsGenerator extends App {
  import java.nio.charset.Charset
  import scala.collection.JavaConverters._

  val charsets = Charset.availableCharsets.asScala
  val sb = new StringBuilder

  for { (name, charset) <- charsets } {
    sb ++= s"\n  // $name\n"

    val aliases = charset.aliases.asScala + name
    val aliasCases = (aliases
      ++ aliases.map(_.toLowerCase)
      ++ aliases.map(_.toUpperCase)
    ).toIndexedSeq.sortBy(n => (n.toLowerCase, n))

    aliasCases foreach { alias =>
      val name = if (alias matches "\\D[^-:.]+") alias else s"`$alias`"
      sb ++= s"""  def $name = apply("$alias")""" += '\n'
    }
  }

  println(sb)
}
