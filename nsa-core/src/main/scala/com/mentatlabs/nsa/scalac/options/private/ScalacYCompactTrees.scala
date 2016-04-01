package com.mentatlabs.nsa
package scalac
package options

/** -Ycompact-trees
  * ===============
  *     2.8.0 - 2.8.2: Use compact tree printer when displaying trees
  *    2.9.0 - 2.12.0: Use compact tree printer when displaying trees.
  */
case object ScalacYCompactTrees
    extends ScalacOptionBoolean("-Ycompact-trees", ScalacVersions.`2.8.0`)
