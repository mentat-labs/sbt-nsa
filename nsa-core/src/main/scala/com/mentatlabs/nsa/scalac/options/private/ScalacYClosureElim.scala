package com.mentatlabs.nsa
package scalac
package options

/* -Yclosure-elim
 * ==============
 *     2.1.5 - 2.5.1: Perform closure elimination // previously -Xcloselim
 *     2.6.0 - 2.8.2: Perform closure elimination
 *    2.9.0 - 2.11.8: Perform closure elimination.
 *            2.12.0: !! missing !!
 */
case object ScalacYClosureElim
    extends ScalacOptionBoolean("-Yclosure-elim", ScalacVersions.`2.6.0`)
