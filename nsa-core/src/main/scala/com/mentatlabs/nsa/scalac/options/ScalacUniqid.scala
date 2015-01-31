package com.mentatlabs.nsa
package scalac
package options

/** -uniqid
  * =======
  *     2.0.0 - 2.5.1: Print identifiers with unique names (debugging option)
  *     2.6.0 - 2.8.2: Print identifiers with unique names for debugging
  *    2.9.0 - 2.12.0: Uniquely tag all identifiers in debugging output.
  */
case object ScalacUniqid
    extends ScalacOptionSwitch("-uniqid") {
  val since = ScalacVersions.`2.0.0`
}
