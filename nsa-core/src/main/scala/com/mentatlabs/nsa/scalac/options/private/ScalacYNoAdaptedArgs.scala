package com.mentatlabs.nsa
package scalac
package options

/** -Yno-adapted-args
  * =================
  *   2.10.0 - 2.12.0: Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver.
  */
case object ScalacYNoAdaptedArgs
    extends ScalacOptionBoolean("-Yno-adapted-args", ScalacVersions.`2.10.0`)
