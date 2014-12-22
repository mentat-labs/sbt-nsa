package com.mentatlabs.nsa

/** Utilize the java.class.path in classpath resolution. */
case object `-usejavacp` extends JustOption {
  val since = ScalacVersion.`2.8.0`
}
