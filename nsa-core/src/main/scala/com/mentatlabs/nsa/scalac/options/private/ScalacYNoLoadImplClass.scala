package com.mentatlabs.nsa
package scalac
package options

/** -Yno-load-impl-class
  * ====================
  *   2.11.0 - 2.12.0: Do not load $class.class files.
  */
case object ScalacYNoLoadImplClass
    extends ScalacOptionSwitch("-Yno-load-impl-class") {
  val since = ScalacVersions.`2.11.0`
}
