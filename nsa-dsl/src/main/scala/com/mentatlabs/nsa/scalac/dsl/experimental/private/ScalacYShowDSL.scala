package com.mentatlabs.nsa
package scalac
package dsl
package experimental

trait ScalacYShowDSL
    extends ScalacExperimentalDSL {

  object Yshow {
    val unary_- = new {
      def -(s: symkinds.type) = options.ScalacYShowSymkinds
      def -(s: symowners.type) = options.ScalacYShowSymowners
      def -(s: syms.type) = options.ScalacYShowSyms

      def -(t: trees.type) = options.ScalacYShowTrees
    }
  }

  implicit class PimpYshowTrees(y: options.ScalacYShowTrees.type) {
    def -(c: compact.type) = options.ScalacYShowTreesCompact
    def -(s: stringified.type) = options.ScalacYShowTreesStringified
  }
}
