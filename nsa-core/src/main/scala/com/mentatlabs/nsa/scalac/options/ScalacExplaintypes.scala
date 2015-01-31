package com.mentatlabs.nsa
package scalac
package options

/** -explaintypes
  * =============
  *     2.0.0 - 2.8.2: Explain type errors in more detail
  *    2.9.0 - 2.12.0: Explain type errors in more detail.
  */
case object ScalacExplaintypes
    extends ScalacOptionSwitch("-explaintypes") {
  val since = ScalacVersions.`2.0.0`
}
