package com.mentatlabs.nsa
package scalac
package options

/* -Ywarn-infer-any
 * ================
 *   2.11.0 - 2.12.0: Warn when a type argument is inferred to be `Any`.
 */
case object ScalacYWarnInferAny
    extends ScalacOptionBoolean("-Ywarn-infer-any", ScalacVersions.`2.11.0`)
