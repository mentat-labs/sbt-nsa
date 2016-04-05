package com.mentatlabs.nsa
package scalac
package options

/* -no-specialization
 * ==================
 *    2.8.0 - 2.12.0: Ignore @specialize annotations.
 */
case object ScalacNoSpecialization
    extends ScalacOptionBoolean("-no-specialization", ScalacVersions.`2.8.0`)
