package com.mentatlabs.nsa
package scalac
package options

/* -Xstrict-inference
 * ==================
 *   2.11.0 - 2.12.0: Don't infer known-unsound types
 */
case object ScalacXStrictInference
    extends ScalacOptionBoolean("-Xstrict-inference", ScalacVersions.`2.11.0`)
