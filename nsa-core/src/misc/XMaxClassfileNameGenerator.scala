package com.mentatlabs.nsa
package scalac
package options

object XMaxClassfileNameGenerator extends App {
  val sb = new StringBuilder

  for (length <- 72 to 255) {
    sb ++= s"""  def `$length` = apply($length)""" += '\n'
  }

  println(sb)
}
