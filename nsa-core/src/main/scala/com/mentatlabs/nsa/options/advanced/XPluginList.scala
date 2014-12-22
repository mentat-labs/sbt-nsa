package com.mentatlabs.nsa

/** Print a synopsis of loaded plugins. */
case object `-Xplugin-list` extends JustOption {
  val since = ScalacVersion.`2.6.0`
}
