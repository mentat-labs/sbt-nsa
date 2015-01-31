package com.mentatlabs.nsa
package scalac
package options

/** -sourcepath <path>
  * ==================
  *     2.0.0 - 2.8.2: Specify where to find input source files
  *    2.9.0 - 2.12.0: Specify location(s) of source files.
  */
object ScalacSourcepath {
  def apply(path: String) =
    new ScalacOptionValue[String]("-sourcepath", path) {
      val since = ScalacVersions.`2.0.0`
    }
}
