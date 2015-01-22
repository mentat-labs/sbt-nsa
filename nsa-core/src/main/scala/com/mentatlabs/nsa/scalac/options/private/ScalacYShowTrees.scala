package com.mentatlabs.nsa
package scalac
package options

/** -Yshow-trees
  * ============
  *     2.6.0 - 2.8.2: Show detailed trees when used in connection with -print:phase
  *     2.9.0 - 2.9.3: (Requires -Xprint:) Print detailed ASTs.
  *   2.10.0 - 2.12.0: (Requires -Xprint:) Print detailed ASTs in formatted form.
  */
case object ScalacYShowTrees
    extends ScalacOptionSwitch("-Yshow-trees") {
  val since = `2.6.0`
}
