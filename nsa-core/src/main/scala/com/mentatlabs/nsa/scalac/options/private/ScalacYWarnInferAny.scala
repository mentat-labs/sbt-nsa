package com.mentatlabs.nsa
package scalac
package options

/** -Ywarn-infer-any
  * ================
  *   2.11.0 - 2.12.0: Warn when a type argument is inferred to be `Any`.
  */
case object ScalacYWarnInferAny
    extends ScalacOptionSwitch("-Ywarn-infer-any") {
  val since = ScalacVersions.`2.11.0`
}
