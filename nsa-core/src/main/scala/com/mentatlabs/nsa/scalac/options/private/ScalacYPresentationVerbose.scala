package com.mentatlabs.nsa
package scalac
package options

/** -Ypresentation-verbose
  * ======================
  *    2.8.2 - 2.12.0: Print information about presentation compiler tasks.
  */
case object ScalacYPresentationVerbose
    extends ScalacOptionBoolean("-Ypresentation-verbose", ScalacVersions.`2.8.2`)
