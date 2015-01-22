package com.mentatlabs.nsa
package scalac
package options

/** -Xplugin-list
  * =============
  *     2.6.0 - 2.8.2: Print a synopsis of loaded plugins
  *    2.9.0 - 2.12.0: Print a synopsis of loaded plugins.
  */
case object ScalacXPluginList
    extends ScalacOptionSwitch("-Xplugin-list") {
  val since = `2.6.0`
}
