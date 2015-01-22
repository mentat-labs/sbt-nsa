package com.mentatlabs.nsa
package scalac
package options

/** -nowarn
  * =======
  *     2.0.0 - 2.8.2: Generate no warnings
  *    2.9.0 - 2.12.0: Generate no warnings.
  */
case object ScalacNowarn
    extends ScalacOptionSwitch("-nowarn") {
  val since = `2.0.0`
}
