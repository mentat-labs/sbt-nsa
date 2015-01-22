package com.mentatlabs.nsa
package scalac
package options

/** -Yide-debug
  * ===========
  *    2.8.0 - 2.12.0: Generate, validate and output trees using the interactive compiler.
  */
case object ScalacYIdeDebug
    extends ScalacOptionSwitch("-Yide-debug") {
  val since = `2.8.0`
}
