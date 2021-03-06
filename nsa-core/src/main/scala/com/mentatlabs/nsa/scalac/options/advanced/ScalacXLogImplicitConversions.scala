package com.mentatlabs.nsa
package scalac
package options

/* -Xlog-implicit-conversions
 * ==========================
 *   2.10.0 - 2.12.0: Print a message whenever an implicit conversion is inserted.
 */
case object ScalacXLogImplicitConversions
    extends ScalacOptionBoolean("-Xlog-implicit-conversions", ScalacVersions.`2.10.0`)
