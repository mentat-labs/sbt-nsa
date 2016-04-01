package com.mentatlabs.nsa
package scalac
package options

/** -Yinfer-by-name
  * ===============
  *   2.11.0 - 2.12.0: Allow inference of by-name types. This is a temporary option to ease transition. See SI-7899.
  *                      deprecated: This flag is scheduled for removal in 2.12. If you have a case where you need this flag then please report a bug.
  */
case object ScalacYInferByName
    extends ScalacOptionBoolean("-Yinfer-by-name", ScalacVersions.`2.11.0`) {
  override val deprecated = Some(ScalacVersions.`2.11.0`)
  override val removed = Some(ScalacVersions.`2.12.0`)
}
