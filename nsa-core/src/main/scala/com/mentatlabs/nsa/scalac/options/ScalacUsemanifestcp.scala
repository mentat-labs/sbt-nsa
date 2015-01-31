package com.mentatlabs.nsa
package scalac
package options

/** -usemanifestcp
  * ==============
  *   2.11.0 - 2.12.0: Utilize the manifest in classpath resolution.
  */
case object ScalacUsemanifestcp
    extends ScalacOptionSwitch("-usemanifestcp") {
  val since = ScalacVersions.`2.11.0`
}
