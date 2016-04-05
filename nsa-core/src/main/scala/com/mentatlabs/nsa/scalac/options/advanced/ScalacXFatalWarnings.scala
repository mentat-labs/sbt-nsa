package com.mentatlabs.nsa
package scalac
package options

/* -Xfatal-warnings
 * ================
 *    2.8.0 - 2.12.0: Fail the compilation if there are any warnings.
 */
case object ScalacXFatalWarnings
    extends ScalacOptionBoolean("-Xfatal-warnings", ScalacVersions.`2.8.0`)
