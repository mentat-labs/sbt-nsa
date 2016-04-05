package com.mentatlabs.nsa
package scalac
package options

/* -Ylog-classpath
 * ===============
 *    2.8.0 - 2.12.0: Output information about what classpath is being applied.
 */
case object ScalacYLogClasspath
    extends ScalacOptionBoolean("-Ylog-classpath", ScalacVersions.`2.8.0`)
