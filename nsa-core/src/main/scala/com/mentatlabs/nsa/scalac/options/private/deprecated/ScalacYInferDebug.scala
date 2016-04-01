package com.mentatlabs.nsa
package scalac
package options

/** -Yinfer-debug
  * =============
  *    2.9.1 - 2.12.0: Trace type inference and implicit search.
  *                      deprecated: Use -Ytyper-debug
  */
case object ScalacYInferDebug
    extends ScalacOptionBoolean("-Yinfer-debug", ScalacVersions.`2.9.1`) {
  override val deprecated = Some(ScalacVersions.`2.11.0`)
}
