package com.mentatlabs.nsa
package scalac
package options

/* -Yno-load-impl-class
 * ====================
 *   2.11.0 - 2.11.8: Do not load $class.class files.
 *            2.12.0: !! missing !!
 */
case object ScalacYNoLoadImplClass
    extends ScalacOptionBoolean("-Yno-load-impl-class", ScalacVersions.`2.11.0`)
