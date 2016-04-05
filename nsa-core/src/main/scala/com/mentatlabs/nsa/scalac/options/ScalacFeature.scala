package com.mentatlabs.nsa
package scalac
package options

/* -feature
 * ========
 *   2.10.0 - 2.12.0: Emit warning and location for usages of features that should be imported explicitly.
 */
case object ScalacFeature
    extends ScalacOptionBoolean("-feature", ScalacVersions.`2.10.0`)
