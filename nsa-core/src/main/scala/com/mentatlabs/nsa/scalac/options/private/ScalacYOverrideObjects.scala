package com.mentatlabs.nsa
package scalac
package options

/* -Yoverride-objects
 * ==================
 *   2.10.0 - 2.12.0: Allow member objects to be overridden.
 */
case object ScalacYOverrideObjects
    extends ScalacOptionBoolean("-Yoverride-objects", ScalacVersions.`2.10.0`)
