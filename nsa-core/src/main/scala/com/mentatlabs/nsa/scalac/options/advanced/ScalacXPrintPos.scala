package com.mentatlabs.nsa
package scalac
package options

/* -Xprint-pos
 * ===========
 *     2.1.7 - 2.5.1: Print tree positions (as offsets) // previously -Xprintpos
 *     2.6.0 - 2.8.2: Print tree positions (as offsets)
 *    2.9.0 - 2.12.0: Print tree positions, as offsets.
 */
case object ScalacXPrintPos
    extends ScalacOptionBoolean("-Xprint-pos", ScalacVersions.`2.6.0`)
