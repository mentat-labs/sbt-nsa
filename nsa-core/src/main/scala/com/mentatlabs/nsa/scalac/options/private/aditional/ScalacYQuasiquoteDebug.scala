package com.mentatlabs.nsa
package scalac
package options

/* -Yquasiquote-debug
 * ==================
 *   2.11.0 - 2.12.0: Trace quasiquote-related activities.
 */
case object ScalacYQuasiquoteDebug
    extends ScalacOptionBoolean("-Yquasiquote-debug", ScalacVersions.`2.11.0`)
