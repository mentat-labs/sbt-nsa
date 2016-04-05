package com.mentatlabs.nsa
package scalac
package options

/* -Ypresentation-debug
 * ====================
 *    2.8.2 - 2.12.0: Enable debugging output for the presentation compiler.
 */
case object ScalacYPresentationStrict
    extends ScalacOptionBoolean("-Ypresentation-strict", ScalacVersions.`2.8.2`)
