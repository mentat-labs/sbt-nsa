package com.mentatlabs.nsa
package scalac
package options

/* -Xno-uescape
 * ============
 *     2.2.0 - 2.5.1: disables handling of \u unicode escapes // previously -nouescape
 *     2.6.0 - 2.8.2: Disables handling of \u unicode escapes
 *    2.9.0 - 2.12.0: Disable handling of \u unicode escapes.
 */
case object ScalacXNoUescape
    extends ScalacOptionBoolean("-Xno-uescape", ScalacVersions.`2.2.0`)
