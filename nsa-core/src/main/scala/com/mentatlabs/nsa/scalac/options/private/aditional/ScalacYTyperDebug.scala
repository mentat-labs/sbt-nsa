package com.mentatlabs.nsa
package scalac
package options

/** -Ytyper-debug
  * =============
  *     2.8.0 - 2.8.2: Trace all type assignements
  *    2.9.0 - 2.12.0: Trace all type assignments.
  */
case object ScalacYTyperDebug
    extends ScalacOptionBoolean("-Ytyper-debug", ScalacVersions.`2.8.0`)
