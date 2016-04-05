package com.mentatlabs.nsa
package scalac
package options

/* -Xno-patmat-analysis
 * ====================
 *   2.10.0 - 2.12.0: Don't perform exhaustivity/unreachability analysis. Also, ignore @switch annotation.
 */
case object ScalacXNoPatmatAnalysis
    extends ScalacOptionBoolean("-Xno-patmat-analysis", ScalacVersions.`2.10.0`)
