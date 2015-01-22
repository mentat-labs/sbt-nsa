package com.mentatlabs.nsa
package scalac
package options

/** -nobootcp
  * =========
  *    2.9.0 - 2.12.0: Do not use the boot classpath for the scala jars.
  */
case object ScalacNobootcp
    extends ScalacOptionSwitch("-nobootcp") {
  val since = `2.9.0`
}
