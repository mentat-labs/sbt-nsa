package com.mentatlabs.nsa
package scalac
package options

/* -Yshow-symowners
 * ================
 *   2.11.0 - 2.12.0: Print owner identifiers next to symbol names.
 */
case object ScalacYShowSymowners
    extends ScalacOptionBoolean("-Yshow-symowners", ScalacVersions.`2.11.0`)
