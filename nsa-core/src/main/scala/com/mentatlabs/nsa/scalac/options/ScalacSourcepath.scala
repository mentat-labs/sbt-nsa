package com.mentatlabs.nsa
package scalac
package options

import java.io.File

/* -sourcepath <path>
 * ==================
 *     2.0.0 - 2.8.2: Specify where to find input source files
 *    2.9.0 - 2.12.0: Specify location(s) of source files.
 */
object ScalacSourcepath {
  def apply(path: File) =
    new ScalacOptionValue[File]("-sourcepath", path) {
      val since = ScalacVersions.`2.0.0`
    }

  def apply(path: String): ScalacOptionValue[File] =
    apply(new File(path))
}
