package com.mentatlabs.nsa
package scalac
package options

/** -version
  * ========
  *     2.0.0 - 2.8.2: Print product version and exit
  *    2.9.0 - 2.12.0: Print product version and exit.
  */
case object ScalacVersion
    extends ScalacOptionSwitch("-version") {
  val since = ScalacVersions.`2.0.0`
}
