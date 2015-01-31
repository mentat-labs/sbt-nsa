package com.mentatlabs.nsa
package scalac
package options

/** -Xcheckinit
  * ===========
  *     2.7.2 - 2.8.2: Add runtime checks on field accessors. Uninitialized accesses result in an exception being thrown.
  *    2.9.0 - 2.12.0: Wrap field accessors to throw an exception on uninitialized access.
  */
case object ScalacXCheckinit
    extends ScalacOptionSwitch("-Xcheckinit") {
  val since = ScalacVersions.`2.7.2`
}
