package com.mentatlabs.nsa
package scalac
package options

/** -Yoverride-vars
  * ===============
  *   2.10.0 - 2.12.0: Allow vars to be overridden.
  */
case object ScalacYOverrideVars
    extends ScalacOptionBoolean("-Yoverride-vars", ScalacVersions.`2.10.0`)
