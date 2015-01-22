package com.mentatlabs.nsa
package scalac
package options

/** -Xexperimental
  * ==============
  *     2.2.0 - 2.5.1: enable experimental extensions
  *     2.6.0 - 2.8.2: Enable experimental extensions
  *    2.9.0 - 2.12.0: Enable experimental extensions.
  */
case object ScalacXExperimental
    extends ScalacOptionSwitch("-Xexperimental") {
  val since = `2.2.0`
}
