package com.mentatlabs.nsa
package scalac
package options

/** -Yno-generic-signatures
  * =======================
  *     2.7.2 - 2.8.2: Suppress generation of generic signatures for Java
  *    2.9.0 - 2.12.0: Suppress generation of generic signatures for Java.
  */
case object ScalacYNoGenericSignatures
    extends ScalacOptionSwitch("-Yno-generic-signatures") {
  val since = ScalacVersions.`2.7.2`
}
