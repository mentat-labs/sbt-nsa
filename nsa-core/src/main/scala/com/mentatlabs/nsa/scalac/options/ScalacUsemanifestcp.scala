package com.mentatlabs.nsa
package scalac
package options

/** -usemanifestcp
  * ==============
  *   2.11.0 - 2.12.0: Utilize the manifest in classpath resolution.
  */
case object ScalacUsemanifestcp
    extends ScalacOptionBoolean("-usemanifestcp", ScalacVersions.`2.11.0`)
