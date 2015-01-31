package com.mentatlabs.nsa
package scalac
package options

/** -usejavacp
  * ==========
  *    2.8.0 - 2.12.0: Utilize the java.class.path in classpath resolution.
  */
case object ScalacUsejavacp
    extends ScalacOptionSwitch("-usejavacp") {
  val since = ScalacVersions.`2.8.0`
}
