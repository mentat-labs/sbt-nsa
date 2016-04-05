package com.mentatlabs.nsa
package scalac
package options

/* -Yeta-expand-keeps-star
 * =======================
 *   2.10.0 - 2.12.0: Eta-expand varargs methods to T* rather than Seq[T].  This is a temporary option to ease transition.
 */
case object ScalacYEtaExpandKeepsStar
    extends ScalacOptionBoolean("-Yeta-expand-keeps-star", ScalacVersions.`2.10.0`) {
  override val deprecated = Some(ScalacVersions.`2.11.0`)
  override val removed = Some(ScalacVersions.`2.12.0`)
}
