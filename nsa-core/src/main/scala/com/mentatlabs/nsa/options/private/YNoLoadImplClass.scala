package com.mentatlabs.nsa

/** Do not load $class.class files. */
case object `-Yno-load-impl-class` extends JustOption {
  val since = ScalacVersion.`2.11.0`
}
