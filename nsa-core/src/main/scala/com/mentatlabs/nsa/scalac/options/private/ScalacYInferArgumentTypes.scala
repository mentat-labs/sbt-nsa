package com.mentatlabs.nsa
package scalac
package options

/** -Yinfer-argument-types
  * ======================
  *     2.8.1 - 2.8.2: Infer types for arguments of overriden methods
  *    2.9.0 - 2.12.0: Infer types for arguments of overriden methods.
  */
case object ScalacYInferArgumentTypes
    extends ScalacOptionSwitch("-Yinfer-argument-types") {
  val since = `2.8.1`
}
