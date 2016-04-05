package com.mentatlabs.nsa
package scalac
package options

/* -optimise
 * =========
 *     2.5.0 - 2.5.1: Optimize. implies -Xinline, -Xcloselim and -Xdce // previously -XO
 *    2.6.0 - 2.11.8: Generates faster bytecode by applying optimisations to the program
 *            2.12.0: Compiler flag for the optimizer in Scala 2.11
 */
case object ScalacOptimise
    extends ScalacOptionBoolean("-optimise", ScalacVersions.`2.6.0`)
