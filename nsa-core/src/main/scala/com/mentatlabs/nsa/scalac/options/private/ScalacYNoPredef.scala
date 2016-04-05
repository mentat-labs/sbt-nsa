package com.mentatlabs.nsa
package scalac
package options

/* -Yno-predef
 * ===========
 *     2.0.0 - 2.5.1: Compile without any implicit predefined values // previously -nopredefs
 *     2.6.0 - 2.8.2: Compile without any implicit predefined values // previously -Yno-predefs
 *     2.9.0 - 2.9.3: !! missing !!
 *   2.10.0 - 2.12.0: Compile without importing Predef.
 */
case object ScalacYNoPredef
    extends ScalacOptionBoolean("-Yno-predef", ScalacVersions.`2.10.0`)
