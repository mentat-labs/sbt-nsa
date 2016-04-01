package com.mentatlabs.nsa
package scalac
package options

/** -Yissue-debug
  * =============
  *   2.10.0 - 2.12.0: Print stack traces when a context issues an error.
  */
case object ScalacYIssueDebug
    extends ScalacOptionBoolean("-Yissue-debug", ScalacVersions.`2.10.0`)
