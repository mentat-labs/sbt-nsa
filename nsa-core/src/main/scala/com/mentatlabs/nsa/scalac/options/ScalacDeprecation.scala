package com.mentatlabs.nsa
package scalac
package options

/* -deprecation
 * ============
 *     2.3.0 - 2.5.1: enable detailed deprecation warnings
 *     2.6.0 - 2.8.2: Output source locations where deprecated APIs are used
 *    2.9.0 - 2.12.0: Emit warning and location for usages of deprecated APIs.
 */
case object ScalacDeprecation
    extends ScalacOptionBoolean("-deprecation", ScalacVersions.`2.3.0`)
