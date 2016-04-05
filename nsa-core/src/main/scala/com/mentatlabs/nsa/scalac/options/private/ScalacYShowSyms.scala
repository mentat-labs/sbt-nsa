package com.mentatlabs.nsa
package scalac
package options

/* -Yshow-syms
 * ===========
 *    2.9.0 - 2.12.0: Print the AST symbol hierarchy after each phase.
 */
case object ScalacYShowSyms
    extends ScalacOptionBoolean("-Yshow-syms", ScalacVersions.`2.9.0`)
