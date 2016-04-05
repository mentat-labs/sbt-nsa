package com.mentatlabs.nsa
package scalac
package options

/* -Xfuture
 * ========
 *     2.7.2 - 2.8.2: Turn on future language features
 *    2.9.0 - 2.12.0: Turn on future language features.
 */
case object ScalacXFuture
    extends ScalacOptionBoolean("-Xfuture", ScalacVersions.`2.7.2`)
