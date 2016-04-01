package com.mentatlabs.nsa
package scalac
package options

/** -Yeta-expand-keeps-star
  * =======================
  *   2.10.0 - 2.12.0: Eta-expand varargs methods to T* rather than Seq[T].  This is a temporary option to ease transition.
  *                      deprecated: This flag is scheduled for removal in 2.12. If you have a case where you need this flag then please report a bug.
  */
case object ScalacYEtaExpandKeepsStar
    extends ScalacOptionBoolean("-Yeta-expand-keeps-star", ScalacVersions.`2.10.0`) {
  override val deprecated = Some(ScalacVersions.`2.11.0`)
  override val removed = Some(ScalacVersions.`2.12.0`)
}
