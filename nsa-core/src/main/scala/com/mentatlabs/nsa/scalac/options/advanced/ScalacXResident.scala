package com.mentatlabs.nsa
package scalac
package options

/** -Xresident
  * ==========
  *     2.6.0 - 2.8.2: Compiler stays resident, files to compile are read from standard input
  *    2.9.0 - 2.12.0: Compiler stays resident: read source filenames from standard input.
  */
case object ScalacXResident
    extends ScalacOptionSwitch("-Xresident") {
  val since = `2.6.0`
}
