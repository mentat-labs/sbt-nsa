package com.mentatlabs.nsa
package scalac
package dsl

import options._

trait ScalacYShowDSL
    extends ScalacOptionDSL {

  object Yshow {
    val unary_- = `-Yshow`
    object `-Yshow` {
      def -(s: symkinds.type) = ScalacYShowSymkinds
      def -(s: symowners.type) = ScalacYShowSymowners
      def -(s: syms.type) = ScalacYShowSyms

      def -(t: trees.type) = ScalacYShowTrees
    }
  }

  implicit class PimpYshowTrees(y: ScalacYShowTrees.type) {
    def -(c: compact.type) = ScalacYShowTreesCompact
    def -(s: stringified.type) = ScalacYShowTreesStringified
  }
}
