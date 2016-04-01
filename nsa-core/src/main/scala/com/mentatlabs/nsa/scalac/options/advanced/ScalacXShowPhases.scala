package com.mentatlabs.nsa
package scalac
package options

/** -Xshow-phases
  * =============
  *     2.6.0 - 2.8.2: Print a synopsis of compiler phases
  *    2.9.0 - 2.12.0: Print a synopsis of compiler phases.
  */
case object ScalacXShowPhases
    extends ScalacOptionBoolean("-Xshow-phases", ScalacVersions.`2.6.0`)
