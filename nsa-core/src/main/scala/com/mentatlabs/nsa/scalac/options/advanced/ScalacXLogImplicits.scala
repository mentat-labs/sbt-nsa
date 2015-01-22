package com.mentatlabs.nsa
package scalac
package options

/** -Xlog-implicits
  * ===============
  *     2.7.0 - 2.8.2: Show more info on why some implicits are not applicable
  *    2.9.0 - 2.12.0: Show more detail on why some implicits are not applicable.
  */
case object ScalacXLogImplicits
    extends ScalacOptionSwitch("-Xlog-implicits") {
  val since = `2.7.0`
}
