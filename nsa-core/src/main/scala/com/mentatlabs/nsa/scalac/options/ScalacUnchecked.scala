package com.mentatlabs.nsa
package scalac
package options

/* -unchecked
 * ==========
 *     2.3.0 - 2.5.1: enable detailed unchecked warnings
 *     2.6.0 - 2.8.2: Enable detailed unchecked warnings
 *     2.9.0 - 2.9.3: Enable detailed unchecked (erasure) warnings.
 *   2.10.0 - 2.12.0: Enable additional warnings where generated code depends on assumptions.
 */
case object ScalacUnchecked
    extends ScalacOptionBoolean("-unchecked", ScalacVersions.`2.3.0`)
